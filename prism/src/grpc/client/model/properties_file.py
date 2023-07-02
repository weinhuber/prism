from abc import ABC

from services import prismGrpc_pb2
from services.prismpy import PrismPy


class PropertiesFile(PrismPy, ABC):
    property_file_path = None
    properties_file_object_id = None

    def __init__(self, property_file_path):
        super().__init__()
        self.create_channel()
        # name of original property file
        self.property_file_path = property_file_path
        # id of the module object in the prism server
        self.module_object_id = str(id(self))

    def get_property_object(self, property_index):
        self.logger.info("Get property object {}.".format(property_index))
        # create GetPropertyObjectRequest
        request = prismGrpc_pb2.PropertyObjectRequest(properties_file_object_id=str(id(self)),
                                                      property_index=property_index)
        # Make the RPC call to GetPropertyObject
        response = self.stub.PropertyObject(request)
        self.logger.info("Received message {}.".format(response.status))

        return response.property

    # def __forward(self, name, *args, **kwargs):
    #     self.logger.info("Forwarding unsupported call {} to prism server.".format(name))
    #     # create forward request
    #     request = prismGrpc_pb2.PropertiesFileForwardMethodCallRequest(properties_file_object_id=str(id(self)),
    #                                                                    method=name,
    #                                                                    args=args,
    #                                                                    kwargs=kwargs)
    #     # Make the RPC call to Forward
    #     response = self.stub.PropertiesFileForwardMethodCall(request)
    #     self.logger.info("Received message {}.".format(response.status))
    #
    #     return response.result
    #
    # def __getattr__(self, name):
    #     return lambda *args, **kwargs: self.__forward(name, *args, **kwargs)
