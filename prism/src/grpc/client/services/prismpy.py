from abc import ABC
import grpc
from grpc._channel import _InactiveRpcError

import prism_pb2_grpc
import prismGrpc_pb2_grpc
import logging


class PrismPy(ABC):
    # logger
    logger = None
    # stub (client)
    stub = None

    channel = None

    # specify the size of chunks to read from the file
    __CHUNK_SIZE = 1024 * 1024  # 1MB

    def __init__(self):
        self.__setup_logger()

    # private function to set up the logger
    def __setup_logger(self):
        logging.basicConfig(
            level=logging.INFO,
            format="%(asctime)s [%(levelname)s] %(message)s",
            handlers=[
                logging.StreamHandler()
            ]
        )
        self.logger = logging.getLogger(__name__)

    # private function to create a channel to the gRPC service
    def create_channel(self):
        self.logger.info("Establishing connection to gRPC service.")

        # Open a gRPC channel
        self.channel = grpc.insecure_channel('localhost:50051')

        # Create a stub (client)
        self.stub = prismGrpc_pb2_grpc.PrismProtoServiceStub(self.channel)

    # private function to close the channel to the gRPC service
    def __close_channel(self):
        self.logger.info("Closing connection to gRPC service.")
        self.channel.close()

    # private function to upload a file to the gRPC service
    def upload_file(self, filename):
        try:
            # Upload file
            response = self.stub.UploadFile(self.__get_file_chunks(filename))
            self.logger.info(f"Received message {response.filename}")
            return response

        except _InactiveRpcError:
            # If there was an error, it is likely that the service is unavailable
            self.logger.error(f"gRPC service seems to be unavailable. Please make sure the service is running.")
        except Exception as e:
            self.logger.error(f"Unknown error.\n{str(e)}")

    # private function to cut a file into chunks to be uploaded to the gRPC service
    def __get_file_chunks(self, filename):
        self.logger.info(f"Uploading file {filename} to gRPC service.")
        try:
            with open(filename, 'rb') as f:
                while True:
                    # read a chunk of the file
                    piece = f.read(self.__CHUNK_SIZE)
                    if len(piece) == 0:
                        # if the chunk is empty, we have reached the end of the file
                        return
                    # yield the chunk to the gRPC service
                    yield prismGrpc_pb2_grpc.UploadRequest(chunk_data=piece)
        except FileNotFoundError:
            self.logger.error(f"File {filename} not found. Continues to upload empty file.")

        except Exception as e:
            self.logger.error(f"Unknown error.\n{str(e)}")

    # close the channel to the gRPC service when the object is deleted or code execution ends
    def __del__(self):
        if self.channel is not None:
            self.__close_channel()

