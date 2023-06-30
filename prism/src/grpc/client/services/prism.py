from abc import ABC

import grpc

from model.module_file import ModuleFile
from model.prismpy_exceptions import PrismPyException
from model.property_file import PropertyFile
from prismpy import PrismPy
from services import prismGrpc_pb2


class Prism(PrismPy, ABC):
    __proto_main_log = None

    def __init__(self, main_log):
        super().__init__()
        self.__proto_main_log = main_log.get_proto()
        # TODO: CHECK whether this is correct with PrismFileLog() too

        # # checking if the log is valid and transforming it into a protobuf type
        # if isinstance(main_log, PrismFileLog):
        #     self.__proto_main_log = prism_pb2.PrismLog.PrismFileLog()
        #
        #     # Assigning the output type to the corresponding protobuf type
        #     if main_log.output == "hidden":
        #         self.__proto_main_log.output = prism_pb2.PrismLog.PrismFileLog.STDOUT
        #     elif main_log.output == "stdout":
        #         self.__proto_main_log.output = prism_pb2.PrismLog.PrismFileLog.HIDDEN
        #     else:
        #         # this should never happen since we already double-check it in PrismFileLog.__init__()
        #         raise PrismException("Invalid output type. Please use 'hidden' or 'stdout'.")
        #
        # elif isinstance(main_log, PrismDevNullLog):
        #     self.__proto_main_log = PrismDevNullLog.get_proto()
        #     super().__init__()

    def initialise(self):
        if self.__proto_main_log is None:
            self.logger.error("No log file specified. Please specify a log file.")
            raise PrismPyException("No log file specified. Please specify a log file.")
        else:
            self.create_channel()
            self.logger.info(
                "Initialising Prism Engine with output {}.".format(self.__proto_main_log.__class__.__name__))

            # Initialise Prism Engine
            # Can be either
            # - Prism(PrismDevNullLog())
            # - Prism(PrismFileLog("hidden"))
            # - Prism(PrismFileLog("stdout"))

            request = prismGrpc_pb2.InitialiseRequest()

            try:
                # Call the Initialise method
                response = self.stub.Initialise(request)
                self.logger.info("Received message {}".format(response.result))
            except grpc.RpcError as e:
                self.logger.error("Could not establish connection to the gRPC server. Please make sure the Prism server is running.")
                self.logger.error("gRPC error info: {}".format(e.details()))
                exit(1)

    def parse_and_load_model_file(self, model_file):
        self.logger.info("Parsing model file {}.".format(model_file))

        # first uploading the file to prism
        upload_response = self.upload_file(model_file)
        self.logger.info("Uploaded file {}".format(model_file))

        # instruct prism to parse the uploaded file
        # Create a ParseModelRequest
        self.logger.info("Parsing model file {}.".format(upload_response.filename))

        request = prismGrpc_pb2.ParseAndLoadModelRequest(
            model_file_name=upload_response.filename)

        # Make the RPC call to ParseModelFile
        response = self.stub.ParseAndLoadModel(request)

        self.logger.info("Received message {}.".format(response.result))

        return ModuleFile(model_file, upload_response.filename)

    def parse_properties_file(self, module_file, property_file):
        self.logger.info(
            "Parsing property file {} with module file {}".format(property_file, module_file.property_file_name))
        # TODO: Dictionary with lookup tables for uploaded model file and pointer to its object in the prism server
        # something like (python filename, prism file id)

        # first uploading the file to prism
        upload_response = self.upload_file(property_file)
        self.logger.info("Uploaded file {}".format(property_file))

        # instruct prism to parse the uploaded file
        # Create a Parse Properties Request
        request = prismGrpc_pb2.ParsePropertiesFileRequest(
            model_file_name=module_file.prism_module_name,
            properties_file_name=upload_response.filename)

        # Make the RPC call to ParsePropertiesFile
        response = self.stub.ParsePropertiesFile(request)

        self.logger.info("Received message {}.".format(response.status))

        return PropertyFile(module_file, property_file, upload_response.filename, response.properties)

    def model_check(self, property_file, property_object_index):
        self.logger.info("Model checking property {}.".format(property_file))

        # Create a ModelCheckRequest
        request = prismGrpc_pb2.ModelCheckRequest(
            properties_file_name=property_file.prism_property_name,
            property_index=property_object_index)

        # Make the RPC call to ModelCheck
        response = self.stub.ModelCheck(request)

        self.logger.info("Received message {}.".format(response.result))

        return response.result
