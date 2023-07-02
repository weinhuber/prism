from model.prismpy_base_model import PrismPyBaseModel
from services import prismGrpc_pb2


class UndefinedConstants(PrismPyBaseModel):
    undefined_constants = None

    def __init__(self, modules_file, properties_file, property_object):
        super().__init__()
        self.__init_undefined_constants(modules_file, properties_file, property_object)

    def __init_undefined_constants(self, modules_file, properties_file, property_object):
        self.logger.info("Initializing undefined constants.")

        # create request
        request = prismGrpc_pb2.InitUndefinedConstantsRequest(module_object_id=modules_file.object_id,
                                                              properties_file_object_id=properties_file.object_id,
                                                              property_object_id=property_object.object_id,
                                                              undefined_constants_object_id=self.object_id)

        # Make the RPC call to InitUndefinedConstants
        response = self.stub.InitUndefinedConstants(request)
        self.logger.info("Received message {}.".format(response.status))

    def define_using_const_switch(self, constant):
        self.logger.info("Define using const switch {}.".format(constant))

        # create request
        request = prismGrpc_pb2.DefineUsingConstSwitchRequest(undefined_constants_object_id=self.object_id,
                                                              constant=constant)

        # Make the RPC call to DefineUsingConstSwitch
        response = self.stub.DefineUsingConstSwitch(request)
        self.logger.info("Received message {}.".format(response.status))
