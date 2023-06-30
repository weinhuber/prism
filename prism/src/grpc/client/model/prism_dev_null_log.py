from services import prismGrpc_pb2
from abc import ABC


class PrismDevNullLog(ABC):
    def __init__(self):
        pass

    @staticmethod
    def get_proto():
        return prismGrpc_pb2.PrismLog(dev_null_log=prismGrpc_pb2.PrismDevNullLog())
