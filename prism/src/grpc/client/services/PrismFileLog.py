from abc import ABC

import prismGrpc_pb2_grpc
from PrismException import PrismException


class PrismFileLog(ABC):
    output = None

    def __init__(self, output):
        if output == "hidden" or output == "stdout":
            self.output = output
        else:
            raise PrismException("Invalid output type. Please use 'hidden' or 'stdout'.")

    def get_proto(self):
        proto = prism_pb2.PrismLog.PrismFileLog()

        if self.output == "hidden":
            proto.output = prism_pb2.PrismLog.PrismFileLog.HIDDEN
            return proto
        elif self.output == "stdout":
            proto.output = prism_pb2.PrismLog.PrismFileLog.STDOUT
            return proto
        else:
            # this should never happen since we already double-check it in PrismFileLog.__init__()
            raise PrismException("Invalid output type. Please use 'hidden' or 'stdout'.")
