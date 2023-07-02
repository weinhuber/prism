from services import prismGrpc_pb2
from model.prismpy_exceptions import PrismPyException
from model.prismpy_model import PrismPyBaseModel


class PrismFileLog(PrismPyBaseModel):
    output = None

    def __init__(self, output):
        super().__init__()
        if output == "hidden" or output == "stdout":
            self.output = output
        else:
            raise PrismPyException("Invalid output type for PrismFileLog. Please use 'hidden' or 'stdout'.")

    def get_proto(self):
        if self.output == "hidden":
            return prismGrpc_pb2.PrismLog(file_log=prismGrpc_pb2.PrismFileLog(type='hidden'))
        elif self.output == "stdout":
            return prismGrpc_pb2.PrismLog(file_log=prismGrpc_pb2.PrismFileLog(type='stdout'))
        else:
            # this should never happen since we already double-check it in PrismFileLog.__init__()
            raise PrismPyException("Invalid output type for PrismFileLog. Please use 'hidden' or 'stdout'.")
