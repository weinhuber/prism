import grpc
from model.modules_file import ModulesFile
from model.prismpy_exceptions import PrismPyException
from model.properties_file import PropertiesFile
from model.result import Result
from services import prismGrpc_pb2
from model.prismpy_base_model import PrismPyBaseModel


class Prism(PrismPyBaseModel):
    main_log_object_id = None

    def __init__(self, main_log):
        self.main_log_object_id = main_log.object_id
        super().__init__(standalone=True, main_log_object_id=main_log.object_id)

    def initialise(self):
        if self.main_log_object_id is None:
            self.logger.error("No log file specified. Please specify a log file.")
            raise PrismPyException("No log file specified. Please specify a log file.")
        else:
            self.logger.info("Initialising Prism Engine.")
            # Create a request with PrismDevNullLog
            request = prismGrpc_pb2.InitialiseRequest(prism_object_id=self.object_id)

            try:
                # Call the Initialise method
                response = self.stub.Initialise(request)
                self.logger.info("Received message {}".format(response.status))
            except grpc.RpcError as e:
                self.logger.error(
                    "Could not establish connection to the gRPC server. Please make sure the Prism server is running.")
                self.logger.error("gRPC error info: {}".format(e.details()))
                exit(1)
        return self

    def parse_model_file(self, model_file_path):
        # upload the model file to prism server
        upload_response = self.upload_file(model_file_path)

        # create ModuleFile object to populate and return
        modules_file = ModulesFile(model_file_path)

        # instruct prism to parse the uploaded file
        self.logger.info("Parsing file {}.".format(upload_response.filename))

        # Create a ParseModelRequest
        request = prismGrpc_pb2.ParseModelFileRequest(prism_object_id=self.object_id,
                                                      module_object_id=modules_file.object_id,
                                                      model_file_name=upload_response.filename)

        # Make the RPC call to ParseModelFile
        response = self.stub.ParseModelFile(request)

        self.logger.info("Received message {}.".format(response.status))

        return modules_file

    def load_prism_model(self, module_file):
        self.logger.info("Loading prism model with module file" + module_file.model_file_name)

        # Create a LoadPRISMModelRequest
        request = prismGrpc_pb2.LoadPRISMModelRequest(prism_object_id=self.object_id,
                                                      module_object_id=module_file.object_id)

        # Make the RPC call to LoadPRISMModel
        response = self.stub.LoadPRISMModel(request)

        self.logger.info("Received message {}.".format(response.status))

        return self

    def parse_properties_file(self, module_file, properties_file_path):
        self.logger.info(
            "Parse property file " + properties_file_path)

        # upload the model file to prism server
        upload_response = self.upload_file(properties_file_path)

        # create PropertiesFile object to populate and return
        properties_file = PropertiesFile(properties_file_path=properties_file_path)

        # create ParsePropertiesFileRequest
        request = prismGrpc_pb2.ParsePropertiesFileRequest(prism_object_id=self.object_id,
                                                           module_object_id=module_file.object_id,
                                                           properties_file_object_id=properties_file.object_id,
                                                           properties_file_name=upload_response.filename)

        # Make the RPC call to ParsePropertiesFile
        response = self.stub.ParsePropertiesFile(request)

        self.logger.info("Received message {}.".format(response.status))

        return properties_file

    def model_check(self, *args):
        # hack to allow for overloading
        if len(args) == 1:
            return self.__model_check_properties_string(args[0])
        elif len(args) == 2:
            return self.__model_check_prop_file_prop_obj(args[0], args[1])
        else:
            self.logger.error("Invalid number of arguments passed to model_check method.")
            raise PrismPyException("Invalid number of arguments passed to model_check method.")

    def __model_check_prop_file_prop_obj(self, properties_file, property_object):
        self.logger.info("Model checking property")

        # Create ResultFile object to populate and return
        result = Result()

        # Create a ModelCheckRequest
        request = prismGrpc_pb2.ModelCheckPropFilePropObjRequest(
            prism_object_id=self.object_id,
            properties_file_object_id=properties_file.object_id,
            property_object_id=property_object.object_id,
            result_object_id=result.object_id)

        # Make the RPC call to ModelCheck
        response = self.stub.ModelCheckPropFilePropObj(request)

        # Populate the result object
        result.result = response.result

        self.logger.info("Received message {}.".format(response.status))

        return result

    def __model_check_properties_string(self, properties_string):
        self.logger.info("Model checking property")

        # Create ResultFile object to populate and return
        result = Result()

        # Create a ModelCheckRequest
        request = prismGrpc_pb2.ModelCheckPropStringRequest(
            prism_object_id=self.object_id,
            properties_string=properties_string,
            result_object_id=result.object_id)

        # Make the RPC call to ModelCheck
        response = self.stub.ModelCheckPropString(request)

        # Populate the result object
        result.result = response.result

        self.logger.info("Received message {}.".format(response.status))

        return result

    def parse_properties_string(self, modules_file, properties_string):
        self.logger.info("Parse property string " + properties_string)

        # create PropertiesFile object to populate and return
        properties_file = PropertiesFile(properties_string=properties_string)

        # create ParsePropertiesFileRequest
        request = prismGrpc_pb2.ParsePropertiesStringRequest(prism_object_id=self.object_id,
                                                             module_object_id=modules_file.object_id,
                                                             properties_string=properties_string,
                                                             properties_file_object_id=properties_file.object_id)

        # Make the RPC call to ParsePropertiesFile
        response = self.stub.ParsePropertiesString(request)

        self.logger.info("Received message {}.".format(response.status))

        return properties_file

    def close_down(self):
        self.logger.info("Closing down Prism Engine.")

        # Create a CloseDownRequest
        request = prismGrpc_pb2.CloseDownRequest(prism_object_id=self.object_id)

        # Make the RPC call to CloseDown
        response = self.stub.CloseDown(request)

        self.logger.info("Received message {}.".format(response.status))

        return self
