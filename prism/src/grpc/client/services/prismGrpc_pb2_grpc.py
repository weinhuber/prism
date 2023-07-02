# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

import prismGrpc_pb2 as prismGrpc__pb2


class PrismProtoServiceStub(object):
    """Service Definitions
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.PropertiesFileForwardMethodCall = channel.unary_unary(
                '/PrismProtoService/PropertiesFileForwardMethodCall',
                request_serializer=prismGrpc__pb2.PropertiesFileForwardMethodCallRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.PropertiesFileForwardMethodCallResponse.FromString,
                )
        self.UploadFile = channel.stream_unary(
                '/PrismProtoService/UploadFile',
                request_serializer=prismGrpc__pb2.UploadRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.UploadReply.FromString,
                )
        self.Initialise = channel.unary_unary(
                '/PrismProtoService/Initialise',
                request_serializer=prismGrpc__pb2.InitialiseRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.InitialiseResponse.FromString,
                )
        self.ParseModelFile = channel.unary_unary(
                '/PrismProtoService/ParseModelFile',
                request_serializer=prismGrpc__pb2.ParseModelFileRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.ParseModelFileResponse.FromString,
                )
        self.LoadPRISMModel = channel.unary_unary(
                '/PrismProtoService/LoadPRISMModel',
                request_serializer=prismGrpc__pb2.LoadPRISMModelRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.LoadPRISMModelResponse.FromString,
                )
        self.ParsePropertiesFile = channel.unary_unary(
                '/PrismProtoService/ParsePropertiesFile',
                request_serializer=prismGrpc__pb2.ParsePropertiesFileRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.ParsePropertiesFileResponse.FromString,
                )
        self.GetPropertyObject = channel.unary_unary(
                '/PrismProtoService/GetPropertyObject',
                request_serializer=prismGrpc__pb2.GetPropertyObjectRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.GetPropertyObjectResponse.FromString,
                )
        self.ModelCheck = channel.unary_unary(
                '/PrismProtoService/ModelCheck',
                request_serializer=prismGrpc__pb2.ModelCheckRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.ModelCheckResponse.FromString,
                )
        self.GetUndefinedConstantsUsedInProperty = channel.unary_unary(
                '/PrismProtoService/GetUndefinedConstantsUsedInProperty',
                request_serializer=prismGrpc__pb2.GetUndefinedConstantsUsedInPropertyRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.GetUndefinedConstantsUsedInPropertyResponse.FromString,
                )
        self.AddValue = channel.unary_unary(
                '/PrismProtoService/AddValue',
                request_serializer=prismGrpc__pb2.AddValueRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.AddValueResponse.FromString,
                )
        self.DefineUndefinedConstants = channel.unary_unary(
                '/PrismProtoService/DefineUndefinedConstants',
                request_serializer=prismGrpc__pb2.DefineUndefinedConstantsRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.DefineUndefinedConstantsResponse.FromString,
                )
        self.ModelCheckWithConstants = channel.unary_unary(
                '/PrismProtoService/ModelCheckWithConstants',
                request_serializer=prismGrpc__pb2.ModelCheckWithConstantsRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.ModelCheckResponse.FromString,
                )
        self.ParsePropertiesString = channel.unary_unary(
                '/PrismProtoService/ParsePropertiesString',
                request_serializer=prismGrpc__pb2.ParsePropertiesStringRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.ParsePropertiesStringResponse.FromString,
                )
        self.ModelCheckString = channel.unary_unary(
                '/PrismProtoService/ModelCheckString',
                request_serializer=prismGrpc__pb2.ModelCheckStringRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.ModelCheckStringResponse.FromString,
                )
        self.ClosePrism = channel.unary_unary(
                '/PrismProtoService/ClosePrism',
                request_serializer=prismGrpc__pb2.ClosePrismRequest.SerializeToString,
                response_deserializer=prismGrpc__pb2.ClosePrismResponse.FromString,
                )


class PrismProtoServiceServicer(object):
    """Service Definitions
    """

    def PropertiesFileForwardMethodCall(self, request, context):
        """generic forwarding of method call
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UploadFile(self, request_iterator, context):
        """Generic method to upload files
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Initialise(self, request, context):
        """Initialise the PRISM engine
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ParseModelFile(self, request, context):
        """Parse model file
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def LoadPRISMModel(self, request, context):
        """Load a PRISM model
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ParsePropertiesFile(self, request, context):
        """Parse a properties file
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetPropertyObject(self, request, context):
        """Get propety object from properties file
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ModelCheck(self, request, context):
        """Model check
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def GetUndefinedConstantsUsedInProperty(self, request, context):
        """Get undefined constants used in property
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def AddValue(self, request, context):
        """add values
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def DefineUndefinedConstants(self, request, context):
        """Define undefined constants
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ModelCheckWithConstants(self, request, context):
        """Model check with constants
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ParsePropertiesString(self, request, context):
        """Parse a properties string
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ModelCheckString(self, request, context):
        """Model check a property specified as a string
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def ClosePrism(self, request, context):
        """Close down PRISM
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_PrismProtoServiceServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'PropertiesFileForwardMethodCall': grpc.unary_unary_rpc_method_handler(
                    servicer.PropertiesFileForwardMethodCall,
                    request_deserializer=prismGrpc__pb2.PropertiesFileForwardMethodCallRequest.FromString,
                    response_serializer=prismGrpc__pb2.PropertiesFileForwardMethodCallResponse.SerializeToString,
            ),
            'UploadFile': grpc.stream_unary_rpc_method_handler(
                    servicer.UploadFile,
                    request_deserializer=prismGrpc__pb2.UploadRequest.FromString,
                    response_serializer=prismGrpc__pb2.UploadReply.SerializeToString,
            ),
            'Initialise': grpc.unary_unary_rpc_method_handler(
                    servicer.Initialise,
                    request_deserializer=prismGrpc__pb2.InitialiseRequest.FromString,
                    response_serializer=prismGrpc__pb2.InitialiseResponse.SerializeToString,
            ),
            'ParseModelFile': grpc.unary_unary_rpc_method_handler(
                    servicer.ParseModelFile,
                    request_deserializer=prismGrpc__pb2.ParseModelFileRequest.FromString,
                    response_serializer=prismGrpc__pb2.ParseModelFileResponse.SerializeToString,
            ),
            'LoadPRISMModel': grpc.unary_unary_rpc_method_handler(
                    servicer.LoadPRISMModel,
                    request_deserializer=prismGrpc__pb2.LoadPRISMModelRequest.FromString,
                    response_serializer=prismGrpc__pb2.LoadPRISMModelResponse.SerializeToString,
            ),
            'ParsePropertiesFile': grpc.unary_unary_rpc_method_handler(
                    servicer.ParsePropertiesFile,
                    request_deserializer=prismGrpc__pb2.ParsePropertiesFileRequest.FromString,
                    response_serializer=prismGrpc__pb2.ParsePropertiesFileResponse.SerializeToString,
            ),
            'GetPropertyObject': grpc.unary_unary_rpc_method_handler(
                    servicer.GetPropertyObject,
                    request_deserializer=prismGrpc__pb2.GetPropertyObjectRequest.FromString,
                    response_serializer=prismGrpc__pb2.GetPropertyObjectResponse.SerializeToString,
            ),
            'ModelCheck': grpc.unary_unary_rpc_method_handler(
                    servicer.ModelCheck,
                    request_deserializer=prismGrpc__pb2.ModelCheckRequest.FromString,
                    response_serializer=prismGrpc__pb2.ModelCheckResponse.SerializeToString,
            ),
            'GetUndefinedConstantsUsedInProperty': grpc.unary_unary_rpc_method_handler(
                    servicer.GetUndefinedConstantsUsedInProperty,
                    request_deserializer=prismGrpc__pb2.GetUndefinedConstantsUsedInPropertyRequest.FromString,
                    response_serializer=prismGrpc__pb2.GetUndefinedConstantsUsedInPropertyResponse.SerializeToString,
            ),
            'AddValue': grpc.unary_unary_rpc_method_handler(
                    servicer.AddValue,
                    request_deserializer=prismGrpc__pb2.AddValueRequest.FromString,
                    response_serializer=prismGrpc__pb2.AddValueResponse.SerializeToString,
            ),
            'DefineUndefinedConstants': grpc.unary_unary_rpc_method_handler(
                    servicer.DefineUndefinedConstants,
                    request_deserializer=prismGrpc__pb2.DefineUndefinedConstantsRequest.FromString,
                    response_serializer=prismGrpc__pb2.DefineUndefinedConstantsResponse.SerializeToString,
            ),
            'ModelCheckWithConstants': grpc.unary_unary_rpc_method_handler(
                    servicer.ModelCheckWithConstants,
                    request_deserializer=prismGrpc__pb2.ModelCheckWithConstantsRequest.FromString,
                    response_serializer=prismGrpc__pb2.ModelCheckResponse.SerializeToString,
            ),
            'ParsePropertiesString': grpc.unary_unary_rpc_method_handler(
                    servicer.ParsePropertiesString,
                    request_deserializer=prismGrpc__pb2.ParsePropertiesStringRequest.FromString,
                    response_serializer=prismGrpc__pb2.ParsePropertiesStringResponse.SerializeToString,
            ),
            'ModelCheckString': grpc.unary_unary_rpc_method_handler(
                    servicer.ModelCheckString,
                    request_deserializer=prismGrpc__pb2.ModelCheckStringRequest.FromString,
                    response_serializer=prismGrpc__pb2.ModelCheckStringResponse.SerializeToString,
            ),
            'ClosePrism': grpc.unary_unary_rpc_method_handler(
                    servicer.ClosePrism,
                    request_deserializer=prismGrpc__pb2.ClosePrismRequest.FromString,
                    response_serializer=prismGrpc__pb2.ClosePrismResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'PrismProtoService', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class PrismProtoService(object):
    """Service Definitions
    """

    @staticmethod
    def PropertiesFileForwardMethodCall(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/PropertiesFileForwardMethodCall',
            prismGrpc__pb2.PropertiesFileForwardMethodCallRequest.SerializeToString,
            prismGrpc__pb2.PropertiesFileForwardMethodCallResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UploadFile(request_iterator,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.stream_unary(request_iterator, target, '/PrismProtoService/UploadFile',
            prismGrpc__pb2.UploadRequest.SerializeToString,
            prismGrpc__pb2.UploadReply.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Initialise(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/Initialise',
            prismGrpc__pb2.InitialiseRequest.SerializeToString,
            prismGrpc__pb2.InitialiseResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ParseModelFile(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/ParseModelFile',
            prismGrpc__pb2.ParseModelFileRequest.SerializeToString,
            prismGrpc__pb2.ParseModelFileResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def LoadPRISMModel(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/LoadPRISMModel',
            prismGrpc__pb2.LoadPRISMModelRequest.SerializeToString,
            prismGrpc__pb2.LoadPRISMModelResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ParsePropertiesFile(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/ParsePropertiesFile',
            prismGrpc__pb2.ParsePropertiesFileRequest.SerializeToString,
            prismGrpc__pb2.ParsePropertiesFileResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetPropertyObject(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/GetPropertyObject',
            prismGrpc__pb2.GetPropertyObjectRequest.SerializeToString,
            prismGrpc__pb2.GetPropertyObjectResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ModelCheck(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/ModelCheck',
            prismGrpc__pb2.ModelCheckRequest.SerializeToString,
            prismGrpc__pb2.ModelCheckResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def GetUndefinedConstantsUsedInProperty(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/GetUndefinedConstantsUsedInProperty',
            prismGrpc__pb2.GetUndefinedConstantsUsedInPropertyRequest.SerializeToString,
            prismGrpc__pb2.GetUndefinedConstantsUsedInPropertyResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def AddValue(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/AddValue',
            prismGrpc__pb2.AddValueRequest.SerializeToString,
            prismGrpc__pb2.AddValueResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def DefineUndefinedConstants(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/DefineUndefinedConstants',
            prismGrpc__pb2.DefineUndefinedConstantsRequest.SerializeToString,
            prismGrpc__pb2.DefineUndefinedConstantsResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ModelCheckWithConstants(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/ModelCheckWithConstants',
            prismGrpc__pb2.ModelCheckWithConstantsRequest.SerializeToString,
            prismGrpc__pb2.ModelCheckResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ParsePropertiesString(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/ParsePropertiesString',
            prismGrpc__pb2.ParsePropertiesStringRequest.SerializeToString,
            prismGrpc__pb2.ParsePropertiesStringResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ModelCheckString(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/ModelCheckString',
            prismGrpc__pb2.ModelCheckStringRequest.SerializeToString,
            prismGrpc__pb2.ModelCheckStringResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def ClosePrism(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/PrismProtoService/ClosePrism',
            prismGrpc__pb2.ClosePrismRequest.SerializeToString,
            prismGrpc__pb2.ClosePrismResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
