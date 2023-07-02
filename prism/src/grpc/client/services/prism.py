import uuid
from abc import ABC

import grpc

from model.modules_file import ModulesFile
from model.prism_dev_null_log import PrismDevNullLog
from model.prism_file_log import PrismFileLog
from model.prismpy_exceptions import PrismPyException
from model.properties_file import PropertiesFile
from model.result import Result
from prismpy import PrismPy
from services import prismGrpc_pb2, prismGrpc_pb2_grpc


class Prism(PrismPy, ABC):
    __proto_main_log = None

    prism_object_id = None

    def __init__(self, main_log):
        super().__init__()
        self.__proto_main_log = main_log
        self.prism_object_id = str(uuid.uuid4())

    def initialise(self):
        if self.__proto_main_log is None:
            self.logger.error("No log file specified. Please specify a log file.")
            raise PrismPyException("No log file specified. Please specify a log file.")
        else:
            self.logger.info(
                "Initialising Prism Engine with output {}.".format(self.__proto_main_log.__class__.__name__))

            # Initialise Prism Engine
            # Can be either
            # - Prism(PrismDevNullLog())
            # - Prism(PrismFileLog("hidden"))
            # - Prism(PrismFileLog("stdout"))

            # Create a request with PrismDevNullLog
            request = prismGrpc_pb2.InitialiseRequest(prism_object_id=self.prism_object_id,
                                                      log=self.__proto_main_log.get_proto())

            try:
                # Call the Initialise method
                response = self.stub.Initialise(request)
                self.logger.info("Received message {}".format(response.status))
            except grpc.RpcError as e:
                self.logger.error(
                    "Could not establish connection to the gRPC server. Please make sure the Prism server is running.")
                self.logger.error("gRPC error info: {}".format(e.details()))
                exit(1)

    def parse_model_file(self, model_file_path):
        # upload the model file to prism server
        upload_response = self.upload_file(model_file_path)

        # create ModuleFile object to populate and return
        modules_file = ModulesFile(model_file_path)

        # instruct prism to parse the uploaded file
        self.logger.info("Parsing file {}.".format(upload_response.filename))

        # Create a ParseModelRequest
        request = prismGrpc_pb2.ParseModelFileRequest(prism_object_id=self.prism_object_id,
                                                      module_object_id=modules_file.module_object_id,
                                                      model_file_name=upload_response.filename)

        # Make the RPC call to ParseModelFile
        response = self.stub.ParseModelFile(request)

        self.logger.info("Received message {}.".format(response.status))

        return modules_file

    def load_prism_model(self, module_file):
        self.logger.info("Loading prism model with module file" + module_file.model_file_name)

        # Create a LoadPRISMModelRequest
        request = prismGrpc_pb2.LoadPRISMModelRequest(prism_object_id=self.prism_object_id,
                                                      module_object_id=module_file.module_object_id)

        # Make the RPC call to LoadPRISMModel
        response = self.stub.LoadPRISMModel(request)

        self.logger.info("Received message {}.".format(response.status))

        return

    def parse_properties_file(self, module_file, property_file_path):
        self.logger.info(
            "Parse property file " + property_file_path)

        # upload the model file to prism server
        upload_response = self.upload_file(property_file_path)

        # create PropertiesFile object to populate and return
        properties_file = PropertiesFile(property_file_path)

        # create ParsePropertiesFileRequest
        request = prismGrpc_pb2.ParsePropertiesFileRequest(prism_object_id=self.prism_object_id,
                                                           module_object_id=module_file.module_object_id,
                                                           properties_file_object_id=properties_file.properties_file_object_id,
                                                           properties_file_name=upload_response.filename)

        # Make the RPC call to ParsePropertiesFile
        response = self.stub.ParsePropertiesFile(request)

        self.logger.info("Received message {}.".format(response.status))

        return properties_file

    def model_check(self, properties_file, property_object):
        self.logger.info("Model checking property {}.".format(properties_file.property_file_path))

        # Create ResultFile object to populate and return
        result = Result()

        # Create a ModelCheckRequest
        request = prismGrpc_pb2.ModelCheckRequest(
            prism_object_id=self.prism_object_id,
            properties_file_object_id=properties_file.properties_file_object_id,
            property_object_id=property_object.property_object_id,
            result_object_id=result.result_object_id)

        # Make the RPC call to ModelCheck
        response = self.stub.ModelCheck(request)

        # Populate the result object
        result.result = response.result

        self.logger.info("Received message {}.".format(response.status))

        return result
