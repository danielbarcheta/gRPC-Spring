package generated;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: contrato.proto")
public final class ServicoStringGrpc {

  private ServicoStringGrpc() {}

  public static final String SERVICE_NAME = "proto.ServicoString";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.string_request,
      generated.string_response> getParaMaiusculoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "paraMaiusculo",
      requestType = generated.string_request.class,
      responseType = generated.string_response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.string_request,
      generated.string_response> getParaMaiusculoMethod() {
    io.grpc.MethodDescriptor<generated.string_request, generated.string_response> getParaMaiusculoMethod;
    if ((getParaMaiusculoMethod = ServicoStringGrpc.getParaMaiusculoMethod) == null) {
      synchronized (ServicoStringGrpc.class) {
        if ((getParaMaiusculoMethod = ServicoStringGrpc.getParaMaiusculoMethod) == null) {
          ServicoStringGrpc.getParaMaiusculoMethod = getParaMaiusculoMethod = 
              io.grpc.MethodDescriptor.<generated.string_request, generated.string_response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.ServicoString", "paraMaiusculo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.string_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.string_response.getDefaultInstance()))
                  .setSchemaDescriptor(new ServicoStringMethodDescriptorSupplier("paraMaiusculo"))
                  .build();
          }
        }
     }
     return getParaMaiusculoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServicoStringStub newStub(io.grpc.Channel channel) {
    return new ServicoStringStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServicoStringBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ServicoStringBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServicoStringFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ServicoStringFutureStub(channel);
  }

  /**
   */
  public static abstract class ServicoStringImplBase implements io.grpc.BindableService {

    /**
     */
    public void paraMaiusculo(generated.string_request request,
        io.grpc.stub.StreamObserver<generated.string_response> responseObserver) {
      asyncUnimplementedUnaryCall(getParaMaiusculoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getParaMaiusculoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.string_request,
                generated.string_response>(
                  this, METHODID_PARA_MAIUSCULO)))
          .build();
    }
  }

  /**
   */
  public static final class ServicoStringStub extends io.grpc.stub.AbstractStub<ServicoStringStub> {
    private ServicoStringStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicoStringStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicoStringStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicoStringStub(channel, callOptions);
    }

    /**
     */
    public void paraMaiusculo(generated.string_request request,
        io.grpc.stub.StreamObserver<generated.string_response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getParaMaiusculoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServicoStringBlockingStub extends io.grpc.stub.AbstractStub<ServicoStringBlockingStub> {
    private ServicoStringBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicoStringBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicoStringBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicoStringBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.string_response paraMaiusculo(generated.string_request request) {
      return blockingUnaryCall(
          getChannel(), getParaMaiusculoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServicoStringFutureStub extends io.grpc.stub.AbstractStub<ServicoStringFutureStub> {
    private ServicoStringFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ServicoStringFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServicoStringFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ServicoStringFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.string_response> paraMaiusculo(
        generated.string_request request) {
      return futureUnaryCall(
          getChannel().newCall(getParaMaiusculoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PARA_MAIUSCULO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServicoStringImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServicoStringImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PARA_MAIUSCULO:
          serviceImpl.paraMaiusculo((generated.string_request) request,
              (io.grpc.stub.StreamObserver<generated.string_response>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ServicoStringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServicoStringBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.UserProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServicoString");
    }
  }

  private static final class ServicoStringFileDescriptorSupplier
      extends ServicoStringBaseDescriptorSupplier {
    ServicoStringFileDescriptorSupplier() {}
  }

  private static final class ServicoStringMethodDescriptorSupplier
      extends ServicoStringBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServicoStringMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServicoStringGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServicoStringFileDescriptorSupplier())
              .addMethod(getParaMaiusculoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
