import uuid
from abc import ABC

from services import prismGrpc_pb2
from services.prismpy import PrismPy


class Values(PrismPy, ABC):

    values_object_id = None

    def __init__(self):
        super().__init__()
        self.values_object_id = str(uuid.uuid4())

    def add_value(self, const_name, value):
        request = prismGrpc_pb2.AddValueRequest(values_object_id=self.values_object_id,
                                                const_name=const_name,
                                                value=value)

        response = self.stub.AddValue(request)
        self.logger.info("Received message {}.".format(response.status))
        return response.status
