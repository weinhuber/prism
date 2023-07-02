from services import prismGrpc_pb2
from model.prismpy_base_model import PrismPyBaseModel


class PrismDevNullLog(PrismPyBaseModel):
    def __init__(self):
        super().__init__()

    @staticmethod
    def get_proto():
        return prismGrpc_pb2.PrismLog(dev_null_log=prismGrpc_pb2.PrismDevNullLog())
