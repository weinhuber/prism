import uuid
from abc import ABC

import grpc

from services import prismGrpc_pb2_grpc, prismGrpc_pb2


class PrismPyBaseModel(ABC):
    object_id = None

    def __init__(self):
        # id of the object in the prism server
        self.object_id = str(uuid.uuid4())

    # TODO: Refactor this

    def __create_channel(self):
        # Open a gRPC channel
        self.channel = grpc.insecure_channel('localhost:50051')

        # Create a stub (client)
        self.stub = prismGrpc_pb2_grpc.PrismProtoServiceStub(self.channel)

    # private function to close the channel to the gRPC service
    def __close_channel(self):
        self.channel.close()

    def __del__(self):
        self.__create_channel()
        # create a delete object request
        # create GetPropertyObjectRequest
        request = prismGrpc_pb2.DeleteObjectRequest(object_id=self.object_id)

        # send request
        response = self.stub.DeleteObject(request)
        self.__close_channel()
