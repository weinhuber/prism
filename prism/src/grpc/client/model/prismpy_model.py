import uuid
from abc import ABC

import grpc

from services import prismGrpc_pb2_grpc, prismGrpc_pb2, prismpy_logger


class PrismPyBaseModel(ABC):

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
            self.stub.DeleteObject(request)
            self.__close_channel()
