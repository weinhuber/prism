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
  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismLogRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPrismLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitPrismLog",
      requestType = grpc.server.services.PrismGrpc.InitPrismLogRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismLogRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPrismLogMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismLogRequest, grpc.server.services.PrismGrpc.InitResponse> getInitPrismLogMethod;
    if ((getInitPrismLogMethod = PrismProtoServiceGrpc.getInitPrismLogMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitPrismLogMethod = PrismProtoServiceGrpc.getInitPrismLogMethod) == null) {
          PrismProtoServiceGrpc.getInitPrismLogMethod = getInitPrismLogMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitPrismLogRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitPrismLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitPrismLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitPrismLog"))
              .build();
        }
      }
    }
    return getInitPrismLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitModulesFileRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitModulesFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitModulesFile",
      requestType = grpc.server.services.PrismGrpc.InitModulesFileRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitModulesFileRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitModulesFileMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitModulesFileRequest, grpc.server.services.PrismGrpc.InitResponse> getInitModulesFileMethod;
    if ((getInitModulesFileMethod = PrismProtoServiceGrpc.getInitModulesFileMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitModulesFileMethod = PrismProtoServiceGrpc.getInitModulesFileMethod) == null) {
          PrismProtoServiceGrpc.getInitModulesFileMethod = getInitModulesFileMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitModulesFileRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitModulesFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitModulesFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitModulesFile"))
              .build();
        }
      }
    }
    return getInitModulesFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPrismMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitPrism",
      requestType = grpc.server.services.PrismGrpc.InitPrismRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPrismMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismRequest, grpc.server.services.PrismGrpc.InitResponse> getInitPrismMethod;
    if ((getInitPrismMethod = PrismProtoServiceGrpc.getInitPrismMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitPrismMethod = PrismProtoServiceGrpc.getInitPrismMethod) == null) {
          PrismProtoServiceGrpc.getInitPrismMethod = getInitPrismMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitPrismRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitPrism"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitPrismRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitPrism"))
              .build();
        }
      }
    }
    return getInitPrismMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPrismDevNullLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitPrismDevNullLog",
      requestType = grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPrismDevNullLogMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest, grpc.server.services.PrismGrpc.InitResponse> getInitPrismDevNullLogMethod;
    if ((getInitPrismDevNullLogMethod = PrismProtoServiceGrpc.getInitPrismDevNullLogMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitPrismDevNullLogMethod = PrismProtoServiceGrpc.getInitPrismDevNullLogMethod) == null) {
          PrismProtoServiceGrpc.getInitPrismDevNullLogMethod = getInitPrismDevNullLogMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitPrismDevNullLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitPrismDevNullLog"))
              .build();
        }
      }
    }
    return getInitPrismDevNullLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismFileLogRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPrismFileLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitPrismFileLog",
      requestType = grpc.server.services.PrismGrpc.InitPrismFileLogRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismFileLogRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPrismFileLogMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPrismFileLogRequest, grpc.server.services.PrismGrpc.InitResponse> getInitPrismFileLogMethod;
    if ((getInitPrismFileLogMethod = PrismProtoServiceGrpc.getInitPrismFileLogMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitPrismFileLogMethod = PrismProtoServiceGrpc.getInitPrismFileLogMethod) == null) {
          PrismProtoServiceGrpc.getInitPrismFileLogMethod = getInitPrismFileLogMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitPrismFileLogRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitPrismFileLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitPrismFileLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitPrismFileLog"))
              .build();
        }
      }
    }
    return getInitPrismFileLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPropertiesFileRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPropertiesFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitPropertiesFile",
      requestType = grpc.server.services.PrismGrpc.InitPropertiesFileRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPropertiesFileRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPropertiesFileMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPropertiesFileRequest, grpc.server.services.PrismGrpc.InitResponse> getInitPropertiesFileMethod;
    if ((getInitPropertiesFileMethod = PrismProtoServiceGrpc.getInitPropertiesFileMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitPropertiesFileMethod = PrismProtoServiceGrpc.getInitPropertiesFileMethod) == null) {
          PrismProtoServiceGrpc.getInitPropertiesFileMethod = getInitPropertiesFileMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitPropertiesFileRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitPropertiesFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitPropertiesFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitPropertiesFile"))
              .build();
        }
      }
    }
    return getInitPropertiesFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPropertyObjectRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPropertyObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitPropertyObject",
      requestType = grpc.server.services.PrismGrpc.InitPropertyObjectRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPropertyObjectRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitPropertyObjectMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitPropertyObjectRequest, grpc.server.services.PrismGrpc.InitResponse> getInitPropertyObjectMethod;
    if ((getInitPropertyObjectMethod = PrismProtoServiceGrpc.getInitPropertyObjectMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitPropertyObjectMethod = PrismProtoServiceGrpc.getInitPropertyObjectMethod) == null) {
          PrismProtoServiceGrpc.getInitPropertyObjectMethod = getInitPropertyObjectMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitPropertyObjectRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitPropertyObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitPropertyObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitPropertyObject"))
              .build();
        }
      }
    }
    return getInitPropertyObjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitResultRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitResultMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitResult",
      requestType = grpc.server.services.PrismGrpc.InitResultRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitResultRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitResultMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitResultRequest, grpc.server.services.PrismGrpc.InitResponse> getInitResultMethod;
    if ((getInitResultMethod = PrismProtoServiceGrpc.getInitResultMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitResultMethod = PrismProtoServiceGrpc.getInitResultMethod) == null) {
          PrismProtoServiceGrpc.getInitResultMethod = getInitResultMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitResultRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitResult"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResultRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitResult"))
              .build();
        }
      }
    }
    return getInitResultMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitUndefinedConstantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitUndefinedConstants",
      requestType = grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitUndefinedConstantsMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest, grpc.server.services.PrismGrpc.InitResponse> getInitUndefinedConstantsMethod;
    if ((getInitUndefinedConstantsMethod = PrismProtoServiceGrpc.getInitUndefinedConstantsMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitUndefinedConstantsMethod = PrismProtoServiceGrpc.getInitUndefinedConstantsMethod) == null) {
          PrismProtoServiceGrpc.getInitUndefinedConstantsMethod = getInitUndefinedConstantsMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitUndefinedConstants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitUndefinedConstants"))
              .build();
        }
      }
    }
    return getInitUndefinedConstantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitValuesRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitValuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitValues",
      requestType = grpc.server.services.PrismGrpc.InitValuesRequest.class,
      responseType = grpc.server.services.PrismGrpc.InitResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitValuesRequest,
      grpc.server.services.PrismGrpc.InitResponse> getInitValuesMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.InitValuesRequest, grpc.server.services.PrismGrpc.InitResponse> getInitValuesMethod;
    if ((getInitValuesMethod = PrismProtoServiceGrpc.getInitValuesMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getInitValuesMethod = PrismProtoServiceGrpc.getInitValuesMethod) == null) {
          PrismProtoServiceGrpc.getInitValuesMethod = getInitValuesMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.InitValuesRequest, grpc.server.services.PrismGrpc.InitResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitValues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitValuesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.InitResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("InitValues"))
              .build();
        }
      }
    }
    return getInitValuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DeleteObjectRequest,
      grpc.server.services.PrismGrpc.DeleteObjectResponse> getDeleteObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteObject",
      requestType = grpc.server.services.PrismGrpc.DeleteObjectRequest.class,
      responseType = grpc.server.services.PrismGrpc.DeleteObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DeleteObjectRequest,
      grpc.server.services.PrismGrpc.DeleteObjectResponse> getDeleteObjectMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DeleteObjectRequest, grpc.server.services.PrismGrpc.DeleteObjectResponse> getDeleteObjectMethod;
    if ((getDeleteObjectMethod = PrismProtoServiceGrpc.getDeleteObjectMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getDeleteObjectMethod = PrismProtoServiceGrpc.getDeleteObjectMethod) == null) {
          PrismProtoServiceGrpc.getDeleteObjectMethod = getDeleteObjectMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.DeleteObjectRequest, grpc.server.services.PrismGrpc.DeleteObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.DeleteObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.DeleteObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("DeleteObject"))
              .build();
        }
      }
    }
    return getDeleteObjectMethod;
  }

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

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParseModelFileRequest,
      grpc.server.services.PrismGrpc.ParseModelFileResponse> getParseModelFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ParseModelFile",
      requestType = grpc.server.services.PrismGrpc.ParseModelFileRequest.class,
      responseType = grpc.server.services.PrismGrpc.ParseModelFileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParseModelFileRequest,
      grpc.server.services.PrismGrpc.ParseModelFileResponse> getParseModelFileMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.ParseModelFileRequest, grpc.server.services.PrismGrpc.ParseModelFileResponse> getParseModelFileMethod;
    if ((getParseModelFileMethod = PrismProtoServiceGrpc.getParseModelFileMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getParseModelFileMethod = PrismProtoServiceGrpc.getParseModelFileMethod) == null) {
          PrismProtoServiceGrpc.getParseModelFileMethod = getParseModelFileMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.ParseModelFileRequest, grpc.server.services.PrismGrpc.ParseModelFileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ParseModelFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ParseModelFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.ParseModelFileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("ParseModelFile"))
              .build();
        }
      }
    }
    return getParseModelFileMethod;
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

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetPropertyObjectRequest,
      grpc.server.services.PrismGrpc.GetPropertyObjectResponse> getGetPropertyObjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPropertyObject",
      requestType = grpc.server.services.PrismGrpc.GetPropertyObjectRequest.class,
      responseType = grpc.server.services.PrismGrpc.GetPropertyObjectResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetPropertyObjectRequest,
      grpc.server.services.PrismGrpc.GetPropertyObjectResponse> getGetPropertyObjectMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetPropertyObjectRequest, grpc.server.services.PrismGrpc.GetPropertyObjectResponse> getGetPropertyObjectMethod;
    if ((getGetPropertyObjectMethod = PrismProtoServiceGrpc.getGetPropertyObjectMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getGetPropertyObjectMethod = PrismProtoServiceGrpc.getGetPropertyObjectMethod) == null) {
          PrismProtoServiceGrpc.getGetPropertyObjectMethod = getGetPropertyObjectMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.GetPropertyObjectRequest, grpc.server.services.PrismGrpc.GetPropertyObjectResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPropertyObject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.GetPropertyObjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.GetPropertyObjectResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("GetPropertyObject"))
              .build();
        }
      }
    }
    return getGetPropertyObjectMethod;
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

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest,
      grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse> getGetUndefinedConstantsUsedInPropertyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUndefinedConstantsUsedInProperty",
      requestType = grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest.class,
      responseType = grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest,
      grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse> getGetUndefinedConstantsUsedInPropertyMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest, grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse> getGetUndefinedConstantsUsedInPropertyMethod;
    if ((getGetUndefinedConstantsUsedInPropertyMethod = PrismProtoServiceGrpc.getGetUndefinedConstantsUsedInPropertyMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getGetUndefinedConstantsUsedInPropertyMethod = PrismProtoServiceGrpc.getGetUndefinedConstantsUsedInPropertyMethod) == null) {
          PrismProtoServiceGrpc.getGetUndefinedConstantsUsedInPropertyMethod = getGetUndefinedConstantsUsedInPropertyMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest, grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUndefinedConstantsUsedInProperty"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("GetUndefinedConstantsUsedInProperty"))
              .build();
        }
      }
    }
    return getGetUndefinedConstantsUsedInPropertyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.AddValueRequest,
      grpc.server.services.PrismGrpc.AddValueResponse> getAddValueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddValue",
      requestType = grpc.server.services.PrismGrpc.AddValueRequest.class,
      responseType = grpc.server.services.PrismGrpc.AddValueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.AddValueRequest,
      grpc.server.services.PrismGrpc.AddValueResponse> getAddValueMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.AddValueRequest, grpc.server.services.PrismGrpc.AddValueResponse> getAddValueMethod;
    if ((getAddValueMethod = PrismProtoServiceGrpc.getAddValueMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getAddValueMethod = PrismProtoServiceGrpc.getAddValueMethod) == null) {
          PrismProtoServiceGrpc.getAddValueMethod = getAddValueMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.AddValueRequest, grpc.server.services.PrismGrpc.AddValueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddValue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.AddValueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.AddValueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("AddValue"))
              .build();
        }
      }
    }
    return getAddValueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest,
      grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse> getSetSomeUndefinedConstantsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSomeUndefinedConstants",
      requestType = grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest.class,
      responseType = grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest,
      grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse> getSetSomeUndefinedConstantsMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest, grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse> getSetSomeUndefinedConstantsMethod;
    if ((getSetSomeUndefinedConstantsMethod = PrismProtoServiceGrpc.getSetSomeUndefinedConstantsMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getSetSomeUndefinedConstantsMethod = PrismProtoServiceGrpc.getSetSomeUndefinedConstantsMethod) == null) {
          PrismProtoServiceGrpc.getSetSomeUndefinedConstantsMethod = getSetSomeUndefinedConstantsMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest, grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSomeUndefinedConstants"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("SetSomeUndefinedConstants"))
              .build();
        }
      }
    }
    return getSetSomeUndefinedConstantsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest,
      grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse> getDefineUsingConstSwitchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DefineUsingConstSwitch",
      requestType = grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest.class,
      responseType = grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest,
      grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse> getDefineUsingConstSwitchMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest, grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse> getDefineUsingConstSwitchMethod;
    if ((getDefineUsingConstSwitchMethod = PrismProtoServiceGrpc.getDefineUsingConstSwitchMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getDefineUsingConstSwitchMethod = PrismProtoServiceGrpc.getDefineUsingConstSwitchMethod) == null) {
          PrismProtoServiceGrpc.getDefineUsingConstSwitchMethod = getDefineUsingConstSwitchMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest, grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DefineUsingConstSwitch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("DefineUsingConstSwitch"))
              .build();
        }
      }
    }
    return getDefineUsingConstSwitchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest,
      grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse> getGetNumberPropertyIterationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNumberPropertyIterations",
      requestType = grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest.class,
      responseType = grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest,
      grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse> getGetNumberPropertyIterationsMethod() {
    io.grpc.MethodDescriptor<grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest, grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse> getGetNumberPropertyIterationsMethod;
    if ((getGetNumberPropertyIterationsMethod = PrismProtoServiceGrpc.getGetNumberPropertyIterationsMethod) == null) {
      synchronized (PrismProtoServiceGrpc.class) {
        if ((getGetNumberPropertyIterationsMethod = PrismProtoServiceGrpc.getGetNumberPropertyIterationsMethod) == null) {
          PrismProtoServiceGrpc.getGetNumberPropertyIterationsMethod = getGetNumberPropertyIterationsMethod =
              io.grpc.MethodDescriptor.<grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest, grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNumberPropertyIterations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PrismProtoServiceMethodDescriptorSupplier("GetNumberPropertyIterations"))
              .build();
        }
      }
    }
    return getGetNumberPropertyIterationsMethod;
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
     *&#47;////////////////////////////////////// Initializer /////////////////////////////////////////
     * Prism Log
     * </pre>
     */
    public void initPrismLog(grpc.server.services.PrismGrpc.InitPrismLogRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitPrismLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * ModulesFile
     * </pre>
     */
    public void initModulesFile(grpc.server.services.PrismGrpc.InitModulesFileRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitModulesFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Prism
     * </pre>
     */
    public void initPrism(grpc.server.services.PrismGrpc.InitPrismRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitPrismMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrismDevNullFlog
     * </pre>
     */
    public void initPrismDevNullLog(grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitPrismDevNullLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * PrismFileLog
     * </pre>
     */
    public void initPrismFileLog(grpc.server.services.PrismGrpc.InitPrismFileLogRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitPrismFileLogMethod(), responseObserver);
    }

    /**
     * <pre>
     * PropertiesFile
     * </pre>
     */
    public void initPropertiesFile(grpc.server.services.PrismGrpc.InitPropertiesFileRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitPropertiesFileMethod(), responseObserver);
    }

    /**
     * <pre>
     * Property Object (called Property Object because "property" is a reserved word in Python)
     * </pre>
     */
    public void initPropertyObject(grpc.server.services.PrismGrpc.InitPropertyObjectRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitPropertyObjectMethod(), responseObserver);
    }

    /**
     * <pre>
     * Result
     * </pre>
     */
    public void initResult(grpc.server.services.PrismGrpc.InitResultRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitResultMethod(), responseObserver);
    }

    /**
     * <pre>
     * init undefined constants
     * </pre>
     */
    public void initUndefinedConstants(grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitUndefinedConstantsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Values
     * </pre>
     */
    public void initValues(grpc.server.services.PrismGrpc.InitValuesRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitValuesMethod(), responseObserver);
    }

    /**
     * <pre>
     *&#47;////////////////////////////////////// Generic Functions /////////////////////////////////////////
     * delete a PRISM object
     * </pre>
     */
    public void deleteObject(grpc.server.services.PrismGrpc.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteObjectMethod(), responseObserver);
    }

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
     *&#47;////////////////////////////////////// Object specific functions /////////////////////////////////////////
     * Initialise the PRISM engine
     * </pre>
     */
    public void initialise(grpc.server.services.PrismGrpc.InitialiseRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitialiseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitialiseMethod(), responseObserver);
    }

    /**
     * <pre>
     * Parse model file
     * </pre>
     */
    public void parseModelFile(grpc.server.services.PrismGrpc.ParseModelFileRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParseModelFileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getParseModelFileMethod(), responseObserver);
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
     * Get propety object from properties file
     * </pre>
     */
    public void getPropertyObject(grpc.server.services.PrismGrpc.GetPropertyObjectRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetPropertyObjectResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPropertyObjectMethod(), responseObserver);
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
     * Get undefined constants used in property
     * </pre>
     */
    public void getUndefinedConstantsUsedInProperty(grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUndefinedConstantsUsedInPropertyMethod(), responseObserver);
    }

    /**
     * <pre>
     * add values
     * </pre>
     */
    public void addValue(grpc.server.services.PrismGrpc.AddValueRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.AddValueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddValueMethod(), responseObserver);
    }

    /**
     * <pre>
     * set some undefined constants
     * </pre>
     */
    public void setSomeUndefinedConstants(grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSomeUndefinedConstantsMethod(), responseObserver);
    }

    /**
     * <pre>
     * define using const switch for undefined constants
     * </pre>
     */
    public void defineUsingConstSwitch(grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDefineUsingConstSwitchMethod(), responseObserver);
    }

    /**
     * <pre>
     * get number of property iterations for undefined constants
     * </pre>
     */
    public void getNumberPropertyIterations(grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNumberPropertyIterationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInitPrismLogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitPrismLogRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_PRISM_LOG)))
          .addMethod(
            getInitModulesFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitModulesFileRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_MODULES_FILE)))
          .addMethod(
            getInitPrismMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitPrismRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_PRISM)))
          .addMethod(
            getInitPrismDevNullLogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_PRISM_DEV_NULL_LOG)))
          .addMethod(
            getInitPrismFileLogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitPrismFileLogRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_PRISM_FILE_LOG)))
          .addMethod(
            getInitPropertiesFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitPropertiesFileRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_PROPERTIES_FILE)))
          .addMethod(
            getInitPropertyObjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitPropertyObjectRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_PROPERTY_OBJECT)))
          .addMethod(
            getInitResultMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitResultRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_RESULT)))
          .addMethod(
            getInitUndefinedConstantsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_UNDEFINED_CONSTANTS)))
          .addMethod(
            getInitValuesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.InitValuesRequest,
                grpc.server.services.PrismGrpc.InitResponse>(
                  this, METHODID_INIT_VALUES)))
          .addMethod(
            getDeleteObjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.DeleteObjectRequest,
                grpc.server.services.PrismGrpc.DeleteObjectResponse>(
                  this, METHODID_DELETE_OBJECT)))
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
            getParseModelFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ParseModelFileRequest,
                grpc.server.services.PrismGrpc.ParseModelFileResponse>(
                  this, METHODID_PARSE_MODEL_FILE)))
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
            getGetPropertyObjectMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.GetPropertyObjectRequest,
                grpc.server.services.PrismGrpc.GetPropertyObjectResponse>(
                  this, METHODID_GET_PROPERTY_OBJECT)))
          .addMethod(
            getModelCheckMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.ModelCheckRequest,
                grpc.server.services.PrismGrpc.ModelCheckResponse>(
                  this, METHODID_MODEL_CHECK)))
          .addMethod(
            getGetUndefinedConstantsUsedInPropertyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest,
                grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse>(
                  this, METHODID_GET_UNDEFINED_CONSTANTS_USED_IN_PROPERTY)))
          .addMethod(
            getAddValueMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.AddValueRequest,
                grpc.server.services.PrismGrpc.AddValueResponse>(
                  this, METHODID_ADD_VALUE)))
          .addMethod(
            getSetSomeUndefinedConstantsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest,
                grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse>(
                  this, METHODID_SET_SOME_UNDEFINED_CONSTANTS)))
          .addMethod(
            getDefineUsingConstSwitchMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest,
                grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse>(
                  this, METHODID_DEFINE_USING_CONST_SWITCH)))
          .addMethod(
            getGetNumberPropertyIterationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest,
                grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse>(
                  this, METHODID_GET_NUMBER_PROPERTY_ITERATIONS)))
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
     *&#47;////////////////////////////////////// Initializer /////////////////////////////////////////
     * Prism Log
     * </pre>
     */
    public void initPrismLog(grpc.server.services.PrismGrpc.InitPrismLogRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitPrismLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ModulesFile
     * </pre>
     */
    public void initModulesFile(grpc.server.services.PrismGrpc.InitModulesFileRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitModulesFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Prism
     * </pre>
     */
    public void initPrism(grpc.server.services.PrismGrpc.InitPrismRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitPrismMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrismDevNullFlog
     * </pre>
     */
    public void initPrismDevNullLog(grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitPrismDevNullLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PrismFileLog
     * </pre>
     */
    public void initPrismFileLog(grpc.server.services.PrismGrpc.InitPrismFileLogRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitPrismFileLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PropertiesFile
     * </pre>
     */
    public void initPropertiesFile(grpc.server.services.PrismGrpc.InitPropertiesFileRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitPropertiesFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Property Object (called Property Object because "property" is a reserved word in Python)
     * </pre>
     */
    public void initPropertyObject(grpc.server.services.PrismGrpc.InitPropertyObjectRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitPropertyObjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Result
     * </pre>
     */
    public void initResult(grpc.server.services.PrismGrpc.InitResultRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitResultMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * init undefined constants
     * </pre>
     */
    public void initUndefinedConstants(grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitUndefinedConstantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Values
     * </pre>
     */
    public void initValues(grpc.server.services.PrismGrpc.InitValuesRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitValuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *&#47;////////////////////////////////////// Generic Functions /////////////////////////////////////////
     * delete a PRISM object
     * </pre>
     */
    public void deleteObject(grpc.server.services.PrismGrpc.DeleteObjectRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DeleteObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request, responseObserver);
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
     *&#47;////////////////////////////////////// Object specific functions /////////////////////////////////////////
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
     * Parse model file
     * </pre>
     */
    public void parseModelFile(grpc.server.services.PrismGrpc.ParseModelFileRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParseModelFileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getParseModelFileMethod(), getCallOptions()), request, responseObserver);
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
     * Get propety object from properties file
     * </pre>
     */
    public void getPropertyObject(grpc.server.services.PrismGrpc.GetPropertyObjectRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetPropertyObjectResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPropertyObjectMethod(), getCallOptions()), request, responseObserver);
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
     * Get undefined constants used in property
     * </pre>
     */
    public void getUndefinedConstantsUsedInProperty(grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUndefinedConstantsUsedInPropertyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * add values
     * </pre>
     */
    public void addValue(grpc.server.services.PrismGrpc.AddValueRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.AddValueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddValueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * set some undefined constants
     * </pre>
     */
    public void setSomeUndefinedConstants(grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSomeUndefinedConstantsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * define using const switch for undefined constants
     * </pre>
     */
    public void defineUsingConstSwitch(grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDefineUsingConstSwitchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get number of property iterations for undefined constants
     * </pre>
     */
    public void getNumberPropertyIterations(grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest request,
        io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNumberPropertyIterationsMethod(), getCallOptions()), request, responseObserver);
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
     *&#47;////////////////////////////////////// Initializer /////////////////////////////////////////
     * Prism Log
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initPrismLog(grpc.server.services.PrismGrpc.InitPrismLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitPrismLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ModulesFile
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initModulesFile(grpc.server.services.PrismGrpc.InitModulesFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitModulesFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Prism
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initPrism(grpc.server.services.PrismGrpc.InitPrismRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitPrismMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrismDevNullFlog
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initPrismDevNullLog(grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitPrismDevNullLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PrismFileLog
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initPrismFileLog(grpc.server.services.PrismGrpc.InitPrismFileLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitPrismFileLogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PropertiesFile
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initPropertiesFile(grpc.server.services.PrismGrpc.InitPropertiesFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitPropertiesFileMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Property Object (called Property Object because "property" is a reserved word in Python)
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initPropertyObject(grpc.server.services.PrismGrpc.InitPropertyObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitPropertyObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Result
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initResult(grpc.server.services.PrismGrpc.InitResultRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitResultMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * init undefined constants
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initUndefinedConstants(grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitUndefinedConstantsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Values
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitResponse initValues(grpc.server.services.PrismGrpc.InitValuesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitValuesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;////////////////////////////////////// Generic Functions /////////////////////////////////////////
     * delete a PRISM object
     * </pre>
     */
    public grpc.server.services.PrismGrpc.DeleteObjectResponse deleteObject(grpc.server.services.PrismGrpc.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteObjectMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *&#47;////////////////////////////////////// Object specific functions /////////////////////////////////////////
     * Initialise the PRISM engine
     * </pre>
     */
    public grpc.server.services.PrismGrpc.InitialiseResponse initialise(grpc.server.services.PrismGrpc.InitialiseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitialiseMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Parse model file
     * </pre>
     */
    public grpc.server.services.PrismGrpc.ParseModelFileResponse parseModelFile(grpc.server.services.PrismGrpc.ParseModelFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getParseModelFileMethod(), getCallOptions(), request);
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
     * Get propety object from properties file
     * </pre>
     */
    public grpc.server.services.PrismGrpc.GetPropertyObjectResponse getPropertyObject(grpc.server.services.PrismGrpc.GetPropertyObjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPropertyObjectMethod(), getCallOptions(), request);
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
     * Get undefined constants used in property
     * </pre>
     */
    public grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse getUndefinedConstantsUsedInProperty(grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUndefinedConstantsUsedInPropertyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * add values
     * </pre>
     */
    public grpc.server.services.PrismGrpc.AddValueResponse addValue(grpc.server.services.PrismGrpc.AddValueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddValueMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * set some undefined constants
     * </pre>
     */
    public grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse setSomeUndefinedConstants(grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSomeUndefinedConstantsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * define using const switch for undefined constants
     * </pre>
     */
    public grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse defineUsingConstSwitch(grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDefineUsingConstSwitchMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get number of property iterations for undefined constants
     * </pre>
     */
    public grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse getNumberPropertyIterations(grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNumberPropertyIterationsMethod(), getCallOptions(), request);
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
     *&#47;////////////////////////////////////// Initializer /////////////////////////////////////////
     * Prism Log
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initPrismLog(
        grpc.server.services.PrismGrpc.InitPrismLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitPrismLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ModulesFile
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initModulesFile(
        grpc.server.services.PrismGrpc.InitModulesFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitModulesFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Prism
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initPrism(
        grpc.server.services.PrismGrpc.InitPrismRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitPrismMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrismDevNullFlog
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initPrismDevNullLog(
        grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitPrismDevNullLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PrismFileLog
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initPrismFileLog(
        grpc.server.services.PrismGrpc.InitPrismFileLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitPrismFileLogMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PropertiesFile
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initPropertiesFile(
        grpc.server.services.PrismGrpc.InitPropertiesFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitPropertiesFileMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Property Object (called Property Object because "property" is a reserved word in Python)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initPropertyObject(
        grpc.server.services.PrismGrpc.InitPropertyObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitPropertyObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Result
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initResult(
        grpc.server.services.PrismGrpc.InitResultRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitResultMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * init undefined constants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initUndefinedConstants(
        grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitUndefinedConstantsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Values
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.InitResponse> initValues(
        grpc.server.services.PrismGrpc.InitValuesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitValuesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47;////////////////////////////////////// Generic Functions /////////////////////////////////////////
     * delete a PRISM object
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.DeleteObjectResponse> deleteObject(
        grpc.server.services.PrismGrpc.DeleteObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteObjectMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *&#47;////////////////////////////////////// Object specific functions /////////////////////////////////////////
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
     * Parse model file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.ParseModelFileResponse> parseModelFile(
        grpc.server.services.PrismGrpc.ParseModelFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getParseModelFileMethod(), getCallOptions()), request);
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
     * Get propety object from properties file
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.GetPropertyObjectResponse> getPropertyObject(
        grpc.server.services.PrismGrpc.GetPropertyObjectRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPropertyObjectMethod(), getCallOptions()), request);
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
     * Get undefined constants used in property
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse> getUndefinedConstantsUsedInProperty(
        grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUndefinedConstantsUsedInPropertyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * add values
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.AddValueResponse> addValue(
        grpc.server.services.PrismGrpc.AddValueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddValueMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * set some undefined constants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse> setSomeUndefinedConstants(
        grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSomeUndefinedConstantsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * define using const switch for undefined constants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse> defineUsingConstSwitch(
        grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDefineUsingConstSwitchMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get number of property iterations for undefined constants
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse> getNumberPropertyIterations(
        grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNumberPropertyIterationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INIT_PRISM_LOG = 0;
  private static final int METHODID_INIT_MODULES_FILE = 1;
  private static final int METHODID_INIT_PRISM = 2;
  private static final int METHODID_INIT_PRISM_DEV_NULL_LOG = 3;
  private static final int METHODID_INIT_PRISM_FILE_LOG = 4;
  private static final int METHODID_INIT_PROPERTIES_FILE = 5;
  private static final int METHODID_INIT_PROPERTY_OBJECT = 6;
  private static final int METHODID_INIT_RESULT = 7;
  private static final int METHODID_INIT_UNDEFINED_CONSTANTS = 8;
  private static final int METHODID_INIT_VALUES = 9;
  private static final int METHODID_DELETE_OBJECT = 10;
  private static final int METHODID_INITIALISE = 11;
  private static final int METHODID_PARSE_MODEL_FILE = 12;
  private static final int METHODID_LOAD_PRISMMODEL = 13;
  private static final int METHODID_PARSE_PROPERTIES_FILE = 14;
  private static final int METHODID_GET_PROPERTY_OBJECT = 15;
  private static final int METHODID_MODEL_CHECK = 16;
  private static final int METHODID_GET_UNDEFINED_CONSTANTS_USED_IN_PROPERTY = 17;
  private static final int METHODID_ADD_VALUE = 18;
  private static final int METHODID_SET_SOME_UNDEFINED_CONSTANTS = 19;
  private static final int METHODID_DEFINE_USING_CONST_SWITCH = 20;
  private static final int METHODID_GET_NUMBER_PROPERTY_ITERATIONS = 21;
  private static final int METHODID_UPLOAD_FILE = 22;

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
        case METHODID_INIT_PRISM_LOG:
          serviceImpl.initPrismLog((grpc.server.services.PrismGrpc.InitPrismLogRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_MODULES_FILE:
          serviceImpl.initModulesFile((grpc.server.services.PrismGrpc.InitModulesFileRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_PRISM:
          serviceImpl.initPrism((grpc.server.services.PrismGrpc.InitPrismRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_PRISM_DEV_NULL_LOG:
          serviceImpl.initPrismDevNullLog((grpc.server.services.PrismGrpc.InitPrismDevNullLogRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_PRISM_FILE_LOG:
          serviceImpl.initPrismFileLog((grpc.server.services.PrismGrpc.InitPrismFileLogRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_PROPERTIES_FILE:
          serviceImpl.initPropertiesFile((grpc.server.services.PrismGrpc.InitPropertiesFileRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_PROPERTY_OBJECT:
          serviceImpl.initPropertyObject((grpc.server.services.PrismGrpc.InitPropertyObjectRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_RESULT:
          serviceImpl.initResult((grpc.server.services.PrismGrpc.InitResultRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_UNDEFINED_CONSTANTS:
          serviceImpl.initUndefinedConstants((grpc.server.services.PrismGrpc.InitUndefinedConstantsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_INIT_VALUES:
          serviceImpl.initValues((grpc.server.services.PrismGrpc.InitValuesRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitResponse>) responseObserver);
          break;
        case METHODID_DELETE_OBJECT:
          serviceImpl.deleteObject((grpc.server.services.PrismGrpc.DeleteObjectRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DeleteObjectResponse>) responseObserver);
          break;
        case METHODID_INITIALISE:
          serviceImpl.initialise((grpc.server.services.PrismGrpc.InitialiseRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.InitialiseResponse>) responseObserver);
          break;
        case METHODID_PARSE_MODEL_FILE:
          serviceImpl.parseModelFile((grpc.server.services.PrismGrpc.ParseModelFileRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParseModelFileResponse>) responseObserver);
          break;
        case METHODID_LOAD_PRISMMODEL:
          serviceImpl.loadPRISMModel((grpc.server.services.PrismGrpc.LoadPRISMModelRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.LoadPRISMModelResponse>) responseObserver);
          break;
        case METHODID_PARSE_PROPERTIES_FILE:
          serviceImpl.parsePropertiesFile((grpc.server.services.PrismGrpc.ParsePropertiesFileRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ParsePropertiesFileResponse>) responseObserver);
          break;
        case METHODID_GET_PROPERTY_OBJECT:
          serviceImpl.getPropertyObject((grpc.server.services.PrismGrpc.GetPropertyObjectRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetPropertyObjectResponse>) responseObserver);
          break;
        case METHODID_MODEL_CHECK:
          serviceImpl.modelCheck((grpc.server.services.PrismGrpc.ModelCheckRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.ModelCheckResponse>) responseObserver);
          break;
        case METHODID_GET_UNDEFINED_CONSTANTS_USED_IN_PROPERTY:
          serviceImpl.getUndefinedConstantsUsedInProperty((grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetUndefinedConstantsUsedInPropertyResponse>) responseObserver);
          break;
        case METHODID_ADD_VALUE:
          serviceImpl.addValue((grpc.server.services.PrismGrpc.AddValueRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.AddValueResponse>) responseObserver);
          break;
        case METHODID_SET_SOME_UNDEFINED_CONSTANTS:
          serviceImpl.setSomeUndefinedConstants((grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.SetSomeUndefinedConstantsResponse>) responseObserver);
          break;
        case METHODID_DEFINE_USING_CONST_SWITCH:
          serviceImpl.defineUsingConstSwitch((grpc.server.services.PrismGrpc.DefineUsingConstSwitchRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.DefineUsingConstSwitchResponse>) responseObserver);
          break;
        case METHODID_GET_NUMBER_PROPERTY_ITERATIONS:
          serviceImpl.getNumberPropertyIterations((grpc.server.services.PrismGrpc.GetNumberPropertyIterationsRequest) request,
              (io.grpc.stub.StreamObserver<grpc.server.services.PrismGrpc.GetNumberPropertyIterationsResponse>) responseObserver);
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
              .addMethod(getInitPrismLogMethod())
              .addMethod(getInitModulesFileMethod())
              .addMethod(getInitPrismMethod())
              .addMethod(getInitPrismDevNullLogMethod())
              .addMethod(getInitPrismFileLogMethod())
              .addMethod(getInitPropertiesFileMethod())
              .addMethod(getInitPropertyObjectMethod())
              .addMethod(getInitResultMethod())
              .addMethod(getInitUndefinedConstantsMethod())
              .addMethod(getInitValuesMethod())
              .addMethod(getDeleteObjectMethod())
              .addMethod(getUploadFileMethod())
              .addMethod(getInitialiseMethod())
              .addMethod(getParseModelFileMethod())
              .addMethod(getLoadPRISMModelMethod())
              .addMethod(getParsePropertiesFileMethod())
              .addMethod(getGetPropertyObjectMethod())
              .addMethod(getModelCheckMethod())
              .addMethod(getGetUndefinedConstantsUsedInPropertyMethod())
              .addMethod(getAddValueMethod())
              .addMethod(getSetSomeUndefinedConstantsMethod())
              .addMethod(getDefineUsingConstSwitchMethod())
              .addMethod(getGetNumberPropertyIterationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
