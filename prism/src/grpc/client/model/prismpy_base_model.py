import os
import uuid
from abc import ABC

import grpc
from grpc._channel import _InactiveRpcError

from model.prismpy_exceptions import PrismPyException
from services import prismGrpc_pb2_grpc, prismGrpc_pb2, prismpy_logger


class PrismPyBaseModel(ABC):
    # specify the size of chunks to read from the file
    __CHUNK_SIZE = 1024 * 1024  # 1MB

    # singleton logger
    logger = prismpy_logger.PrismPyLogger().get_logger()

    __object_id = None
    __object_id_accessed = False

    channel = None
    stub = None

    def __init__(self):
        # id of the object in the prism server
        self.__object_id = str(uuid.uuid4())
        self.__create_channel()

    @property
    def object_id(self):
        self.__object_id_accessed = True
        return self.__object_id

    def __create_channel(self):
        # Open a gRPC channel
        self.channel = grpc.insecure_channel('localhost:50051')

        # Create a stub (client)
        self.stub = prismGrpc_pb2_grpc.PrismProtoServiceStub(self.channel)

    # private function to close the channel to the gRPC service
    def __close_channel(self):
        self.channel.close()

        self.stub = None
        self.channel = None

    # private garbage collector which deletes the object on the server
    def __del__(self):
        # check if object was uploaded to the server
        if self.__object_id_accessed:

            # opening channel if not already open
            if self.stub is None:
                self.__create_channel()

            # create a delete object request
            request = prismGrpc_pb2.DeleteObjectRequest(object_id=self.__object_id)

            # send request
            try:
                self.stub.DeleteObject(request)
            except _InactiveRpcError:
                self.logger.error(f"gRPC service seems to be unavailable. Please make sure the service is running.")
            self.__close_channel()

        # function to upload a file to the gRPC service

    def upload_file(self, filename):
        self.logger.info(f"Uploading file {filename} to prism server.")

        # Check if file exists
        if not os.path.isfile(filename):
            self.logger.error(f"File {filename} not found. Aborting upload.")
            raise PrismPyException(f"File {filename} not found. Aborting upload.")

        try:
            # Upload file
            response = self.stub.UploadFile(self.__get_file_chunks(filename))
            self.logger.info(f"File successfully uploaded to {response.filename}")
            return response

        except _InactiveRpcError:
            # If there was an error, it is likely that the service is unavailable
            self.logger.error(f"gRPC service seems to be unavailable. Please make sure the service is running!!!.")
        except Exception as e:
            self.logger.error(f"Unknown error.\n{str(e)}")

        # private function to cut a file into chunks to be uploaded to the gRPC service

    def __get_file_chunks(self, filename):
        self.logger.info(f"Cutting file {filename} into chunks.")

        try:
            # First, yield a request containing the filename
            yield prismGrpc_pb2.UploadRequest(filename=filename)
            self.logger.info(f"Uploaded filename {filename}")

            with open(filename, 'rb') as f:
                while True:
                    # read a chunk of the file
                    piece = f.read(self.__CHUNK_SIZE)
                    if len(piece) == 0:
                        # if the chunk is empty, we have reached the end of the file
                        return
                    # yield the chunk to the gRPC service
                    yield prismGrpc_pb2.UploadRequest(chunk_data=piece)
                    self.logger.info(f"Uploaded chunk of size {len(piece)}")
        except Exception as e:
            self.logger.error(f"Unknown error.\n{str(e)}")
