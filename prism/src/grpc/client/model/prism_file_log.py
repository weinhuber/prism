from abc import ABC

from services import prismGrpc_pb2
from model.prismpy_exceptions import PrismPyException


class PrismFileLog(ABC):
    output = None

    def __init__(self, output):
        if output == "hidden" or output == "stdout":
            self.output = output
        else:
            raise PrismPyException("Invalid output type for PrismFileLog. Please use 'hidden' or 'stdout'.")

    def get_proto(self):
        proto = prismGrpc_pb2.PrismLog.PrismFileLog()

        if self.output == "hidden":
            proto.output = prismGrpc_pb2.PrismLog.PrismFileLog.HIDDEN
            return proto
        elif self.output == "stdout":
            proto.output = prismGrpc_pb2.PrismLog.PrismFileLog.STDOUT
            return proto
        else:
            # this should never happen since we already double-check it in PrismFileLog.__init__()
            raise PrismPyException("Invalid output type for PrismFileLog. Please use 'hidden' or 'stdout'.")
