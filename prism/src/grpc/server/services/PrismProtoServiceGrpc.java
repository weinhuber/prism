package grpc.server.services;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Service Definitions
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: prismGrpc.proto")
public final class PrismProtoServiceGrpc {

  private PrismProtoServiceGrpc() {}

  public static final String SERVICE_NAME = "PrismProtoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.UploadRequest,
      grpc.server.services.PrismGrpc.UploadReply> getUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadFile",
      requestType = grpc.server.services.PrismGrpc.UploadRequest.class,
      responseType = grpc.server.services.PrismGrpc.UploadReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.UploadRequest,
      grpc.server.services.PrismGrpc.UploadReply> getUploadFileMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.UploadRequest, grpc.server.services.PrismGrpc.UploadReply> getUploadFileMethod;
    if ((getUploadFileMethod = PrismProtoServiceGrpc.getUploadFileMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getUploadFileMethod = PrismProtoServiceGrpc.getUploadFileMethod) == null) {
          PrismProtoServiceGrpc.getUploadFileMethod = getUploadFileMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.UploadRequest, grpc.server.services.PrismGrpc.UploadReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.UploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.UploadReply.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("UploadFile"))
              .build();
        }
      }
    }
    return getUploadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitialiseRequest,
      grpc.server.services.PrismGrpc.InitialiseResponse> getInitialiseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Initialise",
      requestType = grpc.server.services.PrismGrpc.InitialiseRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitialiseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitialiseRequest,
      grpc.server.services.PrismGrpc.InitialiseResponse> getInitialiseMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitialiseRequest, grpc.server.services.PrismGrpc.InitialiseResponse> getInitialiseMethod;
    if ((getInitialiseMethod = PrismProtoServiceGrpc.getInitialiseMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitialiseMethod = PrismProtoServiceGrpc.getInitialiseMethod) == null) {
          PrismProtoServiceGrpc.getInitialiseMethod = getInitialiseMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitialiseRequest, grpc.server.services.PrismGrpc.InitialiseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Initialise"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitialiseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitialiseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("Initialise"))
              .build();
        }
      }
    }
    return getInitialiseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParseAndLoadModelRequest,
      grpc.server.services.PrismGrpc.ParseAndLoadModelReply> getParseAndLoadModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseAndLoadModel",
      requestType = grpc.server.services.PrismGrpc.ParseAndLoadModelRequest.class,
      responseType = grpc.server.services.PrismGrpc.ParseAndLoadModelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParseAndLoadModelRequest,
      grpc.server.services.PrismGrpc.ParseAndLoadModelReply> getParseAndLoadModelMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParseAndLoadModelRequest, grpc.server.services.PrismGrpc.ParseAndLoadModelReply> getParseAndLoadModelMethod;
    if ((getParseAndLoadModelMethod = PrismProtoServiceGrpc.getParseAndLoadModelMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getParseAndLoadModelMethod = PrismProtoServiceGrpc.getParseAndLoadModelMethod) == null) {
          PrismProtoServiceGrpc.getParseAndLoadModelMethod = getParseAndLoadModelMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.ParseAndLoadModelRequest, grpc.server.services.PrismGrpc.ParseAndLoadModelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseAndLoadModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ParseAndLoadModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ParseAndLoadModelReply.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("ParseAndLoadModel"))
              .build();
        }
      }
    }
    return getParseAndLoadModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.LoadPRISMModelRequest,
      grpc.server.services.PrismGrpc.LoadPRISMModelResponse> getLoadPRISMModelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoadPRISMModel",
      requestType = grpc.server.services.PrismGrpc.LoadPRISMModelRequest.class,
      responseType = grpc.server.services.PrismGrpc.LoadPRISMModelResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.LoadPRISMModelRequest,
      grpc.server.services.PrismGrpc.LoadPRISMModelResponse> getLoadPRISMModelMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.LoadPRISMModelRequest, grpc.server.services.PrismGrpc.LoadPRISMModelResponse> getLoadPRISMModelMethod;
    if ((getLoadPRISMModelMethod = PrismProtoServiceGrpc.getLoadPRISMModelMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getLoadPRISMModelMethod = PrismProtoServiceGrpc.getLoadPRISMModelMethod) == null) {
          PrismProtoServiceGrpc.getLoadPRISMModelMethod = getLoadPRISMModelMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.LoadPRISMModelRequest, grpc.server.services.PrismGrpc.LoadPRISMModelResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoadPRISMModel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.LoadPRISMModelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.LoadPRISMModelResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("LoadPRISMModel"))
              .build();
        }
      }
    }
    return getLoadPRISMModelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParsePropertiesFileRequest,
      grpc.server.services.PrismGrpc.ParsePropertiesFileResponse> getParsePropertiesFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParsePropertiesFile",
      requestType = grpc.server.services.PrismGrpc.ParsePropertiesFileRequest.class,
      responseType = grpc.server.services.PrismGrpc.ParsePropertiesFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParsePropertiesFileRequest,
      grpc.server.services.PrismGrpc.ParsePropertiesFileResponse> getParsePropertiesFileMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParsePropertiesFileRequest, grpc.server.services.PrismGrpc.ParsePropertiesFileResponse> getParsePropertiesFileMethod;
    if ((getParsePropertiesFileMethod = PrismProtoServiceGrpc.getParsePropertiesFileMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getParsePropertiesFileMethod = PrismProtoServiceGrpc.getParsePropertiesFileMethod) == null) {
          PrismProtoServiceGrpc.getParsePropertiesFileMethod = getParsePropertiesFileMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.ParsePropertiesFileRequest, grpc.server.services.PrismGrpc.ParsePropertiesFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParsePropertiesFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ParsePropertiesFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ParsePropertiesFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("ParsePropertiesFile"))
              .build();
        }
      }
    }
    return getParsePropertiesFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest,
      grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse> getDefineUndefinedConstantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefineUndefinedConstants",
      requestType = grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest.class,
      responseType = grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest,
      grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse> getDefineUndefinedConstantsMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest, grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse> getDefineUndefinedConstantsMethod;
    if ((getDefineUndefinedConstantsMethod = PrismProtoServiceGrpc.getDefineUndefinedConstantsMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getDefineUndefinedConstantsMethod = PrismProtoServiceGrpc.getDefineUndefinedConstantsMethod) == null) {
          PrismProtoServiceGrpc.getDefineUndefinedConstantsMethod = getDefineUndefinedConstantsMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest, grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DefineUndefinedConstants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("DefineUndefinedConstants"))
              .build();
        }
      }
    }
    return getDefineUndefinedConstantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckRequest,
      grpc.server.services.PrismGrpc.ModelCheckResponse> getModelCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelCheck",
      requestType = grpc.server.services.PrismGrpc.ModelCheckRequest.class,
      responseType = grpc.server.services.PrismGrpc.ModelCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckRequest,
      grpc.server.services.PrismGrpc.ModelCheckResponse> getModelCheckMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckRequest, grpc.server.services.PrismGrpc.ModelCheckResponse> getModelCheckMethod;
    if ((getModelCheckMethod = PrismProtoServiceGrpc.getModelCheckMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getModelCheckMethod = PrismProtoServiceGrpc.getModelCheckMethod) == null) {
          PrismProtoServiceGrpc.getModelCheckMethod = getModelCheckMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.ModelCheckRequest, grpc.server.services.PrismGrpc.ModelCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ModelCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ModelCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("ModelCheck"))
              .build();
        }
      }
    }
    return getModelCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest,
      grpc.server.services.PrismGrpc.ModelCheckResponse> getModelCheckWithConstantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelCheckWithConstants",
      requestType = grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest.class,
      responseType = grpc.server.services.PrismGrpc.ModelCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest,
      grpc.server.services.PrismGrpc.ModelCheckResponse> getModelCheckWithConstantsMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest, grpc.server.services.PrismGrpc.ModelCheckResponse> getModelCheckWithConstantsMethod;
    if ((getModelCheckWithConstantsMethod = PrismProtoServiceGrpc.getModelCheckWithConstantsMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getModelCheckWithConstantsMethod = PrismProtoServiceGrpc.getModelCheckWithConstantsMethod) == null) {
          PrismProtoServiceGrpc.getModelCheckWithConstantsMethod = getModelCheckWithConstantsMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest, grpc.server.services.PrismGrpc.ModelCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelCheckWithConstants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ModelCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("ModelCheckWithConstants"))
              .build();
        }
      }
    }
    return getModelCheckWithConstantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParsePropertiesStringRequest,
      grpc.server.services.PrismGrpc.ParsePropertiesStringResponse> getParsePropertiesStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParsePropertiesString",
      requestType = grpc.server.services.PrismGrpc.ParsePropertiesStringRequest.class,
      responseType = grpc.server.services.PrismGrpc.ParsePropertiesStringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParsePropertiesStringRequest,
      grpc.server.services.PrismGrpc.ParsePropertiesStringResponse> getParsePropertiesStringMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParsePropertiesStringRequest, grpc.server.services.PrismGrpc.ParsePropertiesStringResponse> getParsePropertiesStringMethod;
    if ((getParsePropertiesStringMethod = PrismProtoServiceGrpc.getParsePropertiesStringMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getParsePropertiesStringMethod = PrismProtoServiceGrpc.getParsePropertiesStringMethod) == null) {
          PrismProtoServiceGrpc.getParsePropertiesStringMethod = getParsePropertiesStringMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.ParsePropertiesStringRequest, grpc.server.services.PrismGrpc.ParsePropertiesStringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParsePropertiesString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ParsePropertiesStringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ParsePropertiesStringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("ParsePropertiesString"))
              .build();
        }
      }
    }
    return getParsePropertiesStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckStringRequest,
      grpc.server.services.PrismGrpc.ModelCheckStringResponse> getModelCheckStringMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModelCheckString",
      requestType = grpc.server.services.PrismGrpc.ModelCheckStringRequest.class,
      responseType = grpc.server.services.PrismGrpc.ModelCheckStringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckStringRequest,
      grpc.server.services.PrismGrpc.ModelCheckStringResponse> getModelCheckStringMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ModelCheckStringRequest, grpc.server.services.PrismGrpc.ModelCheckStringResponse> getModelCheckStringMethod;
    if ((getModelCheckStringMethod = PrismProtoServiceGrpc.getModelCheckStringMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getModelCheckStringMethod = PrismProtoServiceGrpc.getModelCheckStringMethod) == null) {
          PrismProtoServiceGrpc.getModelCheckStringMethod = getModelCheckStringMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.ModelCheckStringRequest, grpc.server.services.PrismGrpc.ModelCheckStringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ModelCheckString"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ModelCheckStringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ModelCheckStringResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("ModelCheckString"))
              .build();
        }
      }
    }
    return getModelCheckStringMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ClosePrismRequest,
      grpc.server.services.PrismGrpc.ClosePrismResponse> getClosePrismMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClosePrism",
      requestType = grpc.server.services.PrismGrpc.ClosePrismRequest.class,
      responseType = grpc.server.services.PrismGrpc.ClosePrismResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ClosePrismRequest,
      grpc.server.services.PrismGrpc.ClosePrismResponse> getClosePrismMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ClosePrismRequest, grpc.server.services.PrismGrpc.ClosePrismResponse> getClosePrismMethod;
    if ((getClosePrismMethod = PrismProtoServiceGrpc.getClosePrismMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getClosePrismMethod = PrismProtoServiceGrpc.getClosePrismMethod) == null) {
          PrismProtoServiceGrpc.getClosePrismMethod = getClosePrismMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.ClosePrismRequest, grpc.server.services.PrismGrpc.ClosePrismResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClosePrism"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ClosePrismRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ClosePrismResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("ClosePrism"))
              .build();
        }
      }
    }
    return getClosePrismMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrismProtoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrismProtoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrismProtoServiceStub>() {
        @java.lang.Override
        public PrismProtoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrismProtoServiceStub(channel, callOptions);
        }
      };
    return PrismProtoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrismProtoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrismProtoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrismProtoServiceBlockingStub>() {
        @java.lang.Override
        public PrismProtoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrismProtoServiceBlockingStub(channel, callOptions);
        }
      };
    return PrismProtoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrismProtoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PrismProtoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PrismProtoServiceFutureStub>() {
        @java.lang.Override
        public PrismProtoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PrismProtoServiceFutureStub(channel, callOptions);
        }
      };
    return PrismProtoServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Service Definitions
   * </pre>
   */
  public static abstract class PrismProtoServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Generic method to upload files
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.UploadRequest> uploadFile(
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.UploadReply> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Initialise the PRISM engine
     * </pre>
     */
    public void initialise(grpc.server.services.PrismGrpc.InitialiseRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitialiseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitialiseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Parse a model file
     * </pre>
     */
    public void parseAndLoadModel(grpc.server.services.PrismGrpc.ParseAndLoadModelRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParseAndLoadModelReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParseAndLoadModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Load a PRISM model
     * </pre>
     */
    public void loadPRISMModel(grpc.server.services.PrismGrpc.LoadPRISMModelRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.LoadPRISMModelResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadPRISMModelMethod(), responseObserver);
    }

    /**
     * <pre>
     * Parse a properties file
     * </pre>
     */
    public void parsePropertiesFile(grpc.server.services.PrismGrpc.ParsePropertiesFileRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParsePropertiesFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParsePropertiesFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Define undefined constants
     * </pre>
     */
    public void defineUndefinedConstants(grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefineUndefinedConstantsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Model check
     * </pre>
     */
    public void modelCheck(grpc.server.services.PrismGrpc.ModelCheckRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelCheckMethod(), responseObserver);
    }

    /**
     * <pre>
     * Model check with constants
     * </pre>
     */
    public void modelCheckWithConstants(grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelCheckWithConstantsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Parse a properties string
     * </pre>
     */
    public void parsePropertiesString(grpc.server.services.PrismGrpc.ParsePropertiesStringRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParsePropertiesStringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParsePropertiesStringMethod(), responseObserver);
    }

    /**
     * <pre>
     * Model check a property specified as a string
     * </pre>
     */
    public void modelCheckString(grpc.server.services.PrismGrpc.ModelCheckStringRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckStringResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getModelCheckStringMethod(), responseObserver);
    }

    /**
     * <pre>
     * Close down PRISM
     * </pre>
     */
    public void closePrism(grpc.server.services.PrismGrpc.ClosePrismRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ClosePrismResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClosePrismMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadFileMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.UploadRequest,
                grpc.server.services.PrismGrpc.UploadReply>(
                  this, METHODID_UPLOAD_FILE)))
          .addMethod(
            getInitialiseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitialiseRequest,
                grpc.server.services.PrismGrpc.InitialiseResponse>(
                  this, METHODID_INITIALISE)))
          .addMethod(
            getParseAndLoadModelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ParseAndLoadModelRequest,
                grpc.server.services.PrismGrpc.ParseAndLoadModelReply>(
                  this, METHODID_PARSE_AND_LOAD_MODEL)))
          .addMethod(
            getLoadPRISMModelMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.LoadPRISMModelRequest,
                grpc.server.services.PrismGrpc.LoadPRISMModelResponse>(
                  this, METHODID_LOAD_PRISMMODEL)))
          .addMethod(
            getParsePropertiesFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ParsePropertiesFileRequest,
                grpc.server.services.PrismGrpc.ParsePropertiesFileResponse>(
                  this, METHODID_PARSE_PROPERTIES_FILE)))
          .addMethod(
            getDefineUndefinedConstantsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest,
                grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse>(
                  this, METHODID_DEFINE_UNDEFINED_CONSTANTS)))
          .addMethod(
            getModelCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ModelCheckRequest,
                grpc.server.services.PrismGrpc.ModelCheckResponse>(
                  this, METHODID_MODEL_CHECK)))
          .addMethod(
            getModelCheckWithConstantsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest,
                grpc.server.services.PrismGrpc.ModelCheckResponse>(
                  this, METHODID_MODEL_CHECK_WITH_CONSTANTS)))
          .addMethod(
            getParsePropertiesStringMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ParsePropertiesStringRequest,
                grpc.server.services.PrismGrpc.ParsePropertiesStringResponse>(
                  this, METHODID_PARSE_PROPERTIES_STRING)))
          .addMethod(
            getModelCheckStringMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ModelCheckStringRequest,
                grpc.server.services.PrismGrpc.ModelCheckStringResponse>(
                  this, METHODID_MODEL_CHECK_STRING)))
          .addMethod(
            getClosePrismMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ClosePrismRequest,
                grpc.server.services.PrismGrpc.ClosePrismResponse>(
                  this, METHODID_CLOSE_PRISM)))
          .build();
    }
  }

  /**
   * <pre>
   * Service Definitions
   * </pre>
   */
  public static final class PrismProtoServiceStub extends io.grpc.stub.AbstractAsyncStub<PrismProtoServiceStub> {
    private PrismProtoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrismProtoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrismProtoServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Generic method to upload files
     * </pre>
     */
    public io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.UploadRequest> uploadFile(
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.UploadReply> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Initialise the PRISM engine
     * </pre>
     */
    public void initialise(grpc.server.services.PrismGrpc.InitialiseRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitialiseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitialiseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Parse a model file
     * </pre>
     */
    public void parseAndLoadModel(grpc.server.services.PrismGrpc.ParseAndLoadModelRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParseAndLoadModelReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParseAndLoadModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Load a PRISM model
     * </pre>
     */
    public void loadPRISMModel(grpc.server.services.PrismGrpc.LoadPRISMModelRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.LoadPRISMModelResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadPRISMModelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Parse a properties file
     * </pre>
     */
    public void parsePropertiesFile(grpc.server.services.PrismGrpc.ParsePropertiesFileRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParsePropertiesFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParsePropertiesFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Define undefined constants
     * </pre>
     */
    public void defineUndefinedConstants(grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefineUndefinedConstantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Model check
     * </pre>
     */
    public void modelCheck(grpc.server.services.PrismGrpc.ModelCheckRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Model check with constants
     * </pre>
     */
    public void modelCheckWithConstants(grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelCheckWithConstantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Parse a properties string
     * </pre>
     */
    public void parsePropertiesString(grpc.server.services.PrismGrpc.ParsePropertiesStringRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParsePropertiesStringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParsePropertiesStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Model check a property specified as a string
     * </pre>
     */
    public void modelCheckString(grpc.server.services.PrismGrpc.ModelCheckStringRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckStringResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getModelCheckStringMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Close down PRISM
     * </pre>
     */
    public void closePrism(grpc.server.services.PrismGrpc.ClosePrismRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ClosePrismResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClosePrismMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service Definitions
   * </pre>
   */
  public static final class PrismProtoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PrismProtoServiceBlockingStub> {
    private PrismProtoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrismProtoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrismProtoServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initialise the PRISM engine
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitialiseResponse initialise(grpc.server.services.PrismGrpc.InitialiseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitialiseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Parse a model file
     * </pre>
     */
    public grpc.server.services.PrismGrpc.ParseAndLoadModelReply parseAndLoadModel(grpc.server.services.PrismGrpc.ParseAndLoadModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParseAndLoadModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Load a PRISM model
     * </pre>
     */
    public grpc.server.services.PrismGrpc.LoadPRISMModelResponse loadPRISMModel(grpc.server.services.PrismGrpc.LoadPRISMModelRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadPRISMModelMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Parse a properties file
     * </pre>
     */
    public grpc.server.services.PrismGrpc.ParsePropertiesFileResponse parsePropertiesFile(grpc.server.services.PrismGrpc.ParsePropertiesFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParsePropertiesFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Define undefined constants
     * </pre>
     */
    public grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse defineUndefinedConstants(grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefineUndefinedConstantsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Model check
     * </pre>
     */
    public grpc.server.services.PrismGrpc.ModelCheckResponse modelCheck(grpc.server.services.PrismGrpc.ModelCheckRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelCheckMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Model check with constants
     * </pre>
     */
    public grpc.server.services.PrismGrpc.ModelCheckResponse modelCheckWithConstants(grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelCheckWithConstantsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Parse a properties string
     * </pre>
     */
    public grpc.server.services.PrismGrpc.ParsePropertiesStringResponse parsePropertiesString(grpc.server.services.PrismGrpc.ParsePropertiesStringRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParsePropertiesStringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Model check a property specified as a string
     * </pre>
     */
    public grpc.server.services.PrismGrpc.ModelCheckStringResponse modelCheckString(grpc.server.services.PrismGrpc.ModelCheckStringRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getModelCheckStringMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Close down PRISM
     * </pre>
     */
    public grpc.server.services.PrismGrpc.ClosePrismResponse closePrism(grpc.server.services.PrismGrpc.ClosePrismRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClosePrismMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service Definitions
   * </pre>
   */
  public static final class PrismProtoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PrismProtoServiceFutureStub> {
    private PrismProtoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrismProtoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PrismProtoServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Initialise the PRISM engine
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitialiseResponse> initialise(
        grpc.server.services.PrismGrpc.InitialiseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitialiseMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Parse a model file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.ParseAndLoadModelReply> parseAndLoadModel(
        grpc.server.services.PrismGrpc.ParseAndLoadModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParseAndLoadModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Load a PRISM model
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.LoadPRISMModelResponse> loadPRISMModel(
        grpc.server.services.PrismGrpc.LoadPRISMModelRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadPRISMModelMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Parse a properties file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.ParsePropertiesFileResponse> parsePropertiesFile(
        grpc.server.services.PrismGrpc.ParsePropertiesFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParsePropertiesFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Define undefined constants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse> defineUndefinedConstants(
        grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefineUndefinedConstantsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Model check
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.ModelCheckResponse> modelCheck(
        grpc.server.services.PrismGrpc.ModelCheckRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelCheckMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Model check with constants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.ModelCheckResponse> modelCheckWithConstants(
        grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelCheckWithConstantsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Parse a properties string
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.ParsePropertiesStringResponse> parsePropertiesString(
        grpc.server.services.PrismGrpc.ParsePropertiesStringRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParsePropertiesStringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Model check a property specified as a string
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.ModelCheckStringResponse> modelCheckString(
        grpc.server.services.PrismGrpc.ModelCheckStringRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getModelCheckStringMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Close down PRISM
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.ClosePrismResponse> closePrism(
        grpc.server.services.PrismGrpc.ClosePrismRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClosePrismMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INITIALISE = 0;
  private static final int METHODID_PARSE_AND_LOAD_MODEL = 1;
  private static final int METHODID_LOAD_PRISMMODEL = 2;
  private static final int METHODID_PARSE_PROPERTIES_FILE = 3;
  private static final int METHODID_DEFINE_UNDEFINED_CONSTANTS = 4;
  private static final int METHODID_MODEL_CHECK = 5;
  private static final int METHODID_MODEL_CHECK_WITH_CONSTANTS = 6;
  private static final int METHODID_PARSE_PROPERTIES_STRING = 7;
  private static final int METHODID_MODEL_CHECK_STRING = 8;
  private static final int METHODID_CLOSE_PRISM = 9;
  private static final int METHODID_UPLOAD_FILE = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrismProtoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrismProtoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INITIALISE:
          serviceImpl.initialise((grpc.server.services.PrismGrpc.InitialiseRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitialiseResponse>) responseObserver);
          break;
        case METHODID_PARSE_AND_LOAD_MODEL:
          serviceImpl.parseAndLoadModel((grpc.server.services.PrismGrpc.ParseAndLoadModelRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParseAndLoadModelReply>) responseObserver);
          break;
        case METHODID_LOAD_PRISMMODEL:
          serviceImpl.loadPRISMModel((grpc.server.services.PrismGrpc.LoadPRISMModelRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.LoadPRISMModelResponse>) responseObserver);
          break;
        case METHODID_PARSE_PROPERTIES_FILE:
          serviceImpl.parsePropertiesFile((grpc.server.services.PrismGrpc.ParsePropertiesFileRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParsePropertiesFileResponse>) responseObserver);
          break;
        case METHODID_DEFINE_UNDEFINED_CONSTANTS:
          serviceImpl.defineUndefinedConstants((grpc.server.services.PrismGrpc.DefineUndefinedConstantsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DefineUndefinedConstantsResponse>) responseObserver);
          break;
        case METHODID_MODEL_CHECK:
          serviceImpl.modelCheck((grpc.server.services.PrismGrpc.ModelCheckRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckResponse>) responseObserver);
          break;
        case METHODID_MODEL_CHECK_WITH_CONSTANTS:
          serviceImpl.modelCheckWithConstants((grpc.server.services.PrismGrpc.ModelCheckWithConstantsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckResponse>) responseObserver);
          break;
        case METHODID_PARSE_PROPERTIES_STRING:
          serviceImpl.parsePropertiesString((grpc.server.services.PrismGrpc.ParsePropertiesStringRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParsePropertiesStringResponse>) responseObserver);
          break;
        case METHODID_MODEL_CHECK_STRING:
          serviceImpl.modelCheckString((grpc.server.services.PrismGrpc.ModelCheckStringRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckStringResponse>) responseObserver);
          break;
        case METHODID_CLOSE_PRISM:
          serviceImpl.closePrism((grpc.server.services.PrismGrpc.ClosePrismRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ClosePrismResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UPLOAD_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadFile(
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.UploadReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PrismProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrismProtoServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.server.services.PrismGrpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrismProtoService");
    }
  }

  private static final class PrismProtoServiceFileDescriptorSupplier
      extends PrismProtoServiceBaseDescriptorSupplier {
    PrismProtoServiceFileDescriptorSupplier() {}
  }

  private static final class PrismProtoServiceMethodDescriptorSupplier
      extends PrismProtoServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrismProtoServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrismProtoServiceFileDescriptorSupplier())
              .addMethod(getUploadFileMethod())
              .addMethod(getInitialiseMethod())
              .addMethod(getParseAndLoadModelMethod())
              .addMethod(getLoadPRISMModelMethod())
              .addMethod(getParsePropertiesFileMethod())
              .addMethod(getDefineUndefinedConstantsMethod())
              .addMethod(getModelCheckMethod())
              .addMethod(getModelCheckWithConstantsMethod())
              .addMethod(getParsePropertiesStringMethod())
              .addMethod(getModelCheckStringMethod())
              .addMethod(getClosePrismMethod())
              .build();
        }
      }
    }
    return result;
  }
}
