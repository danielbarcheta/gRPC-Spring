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
 * <pre>
 * Definição do serviço de operação para teste de 8 longs
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: contrato.proto")
public final class MathServiceGrpc {

  private MathServiceGrpc() {}

  public static final String SERVICE_NAME = "proto.MathService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<generated.long_request,
      generated.long_responseSoma> getSomaLongsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "somaLongs",
      requestType = generated.long_request.class,
      responseType = generated.long_responseSoma.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.long_request,
      generated.long_responseSoma> getSomaLongsMethod() {
    io.grpc.MethodDescriptor<generated.long_request, generated.long_responseSoma> getSomaLongsMethod;
    if ((getSomaLongsMethod = MathServiceGrpc.getSomaLongsMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getSomaLongsMethod = MathServiceGrpc.getSomaLongsMethod) == null) {
          MathServiceGrpc.getSomaLongsMethod = getSomaLongsMethod = 
              io.grpc.MethodDescriptor.<generated.long_request, generated.long_responseSoma>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.MathService", "somaLongs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.long_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.long_responseSoma.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("somaLongs"))
                  .build();
          }
        }
     }
     return getSomaLongsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<generated.long_request,
      generated.long_responseMaior> getRaizQuadradaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "raizQuadrada",
      requestType = generated.long_request.class,
      responseType = generated.long_responseMaior.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<generated.long_request,
      generated.long_responseMaior> getRaizQuadradaMethod() {
    io.grpc.MethodDescriptor<generated.long_request, generated.long_responseMaior> getRaizQuadradaMethod;
    if ((getRaizQuadradaMethod = MathServiceGrpc.getRaizQuadradaMethod) == null) {
      synchronized (MathServiceGrpc.class) {
        if ((getRaizQuadradaMethod = MathServiceGrpc.getRaizQuadradaMethod) == null) {
          MathServiceGrpc.getRaizQuadradaMethod = getRaizQuadradaMethod = 
              io.grpc.MethodDescriptor.<generated.long_request, generated.long_responseMaior>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "proto.MathService", "raizQuadrada"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.long_request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  generated.long_responseMaior.getDefaultInstance()))
                  .setSchemaDescriptor(new MathServiceMethodDescriptorSupplier("raizQuadrada"))
                  .build();
          }
        }
     }
     return getRaizQuadradaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MathServiceStub newStub(io.grpc.Channel channel) {
    return new MathServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MathServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new MathServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MathServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new MathServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Definição do serviço de operação para teste de 8 longs
   * </pre>
   */
  public static abstract class MathServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void somaLongs(generated.long_request request,
        io.grpc.stub.StreamObserver<generated.long_responseSoma> responseObserver) {
      asyncUnimplementedUnaryCall(getSomaLongsMethod(), responseObserver);
    }

    /**
     */
    public void raizQuadrada(generated.long_request request,
        io.grpc.stub.StreamObserver<generated.long_responseMaior> responseObserver) {
      asyncUnimplementedUnaryCall(getRaizQuadradaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSomaLongsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.long_request,
                generated.long_responseSoma>(
                  this, METHODID_SOMA_LONGS)))
          .addMethod(
            getRaizQuadradaMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                generated.long_request,
                generated.long_responseMaior>(
                  this, METHODID_RAIZ_QUADRADA)))
          .build();
    }
  }

  /**
   * <pre>
   * Definição do serviço de operação para teste de 8 longs
   * </pre>
   */
  public static final class MathServiceStub extends io.grpc.stub.AbstractStub<MathServiceStub> {
    private MathServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceStub(channel, callOptions);
    }

    /**
     */
    public void somaLongs(generated.long_request request,
        io.grpc.stub.StreamObserver<generated.long_responseSoma> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSomaLongsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void raizQuadrada(generated.long_request request,
        io.grpc.stub.StreamObserver<generated.long_responseMaior> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRaizQuadradaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Definição do serviço de operação para teste de 8 longs
   * </pre>
   */
  public static final class MathServiceBlockingStub extends io.grpc.stub.AbstractStub<MathServiceBlockingStub> {
    private MathServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public generated.long_responseSoma somaLongs(generated.long_request request) {
      return blockingUnaryCall(
          getChannel(), getSomaLongsMethod(), getCallOptions(), request);
    }

    /**
     */
    public generated.long_responseMaior raizQuadrada(generated.long_request request) {
      return blockingUnaryCall(
          getChannel(), getRaizQuadradaMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Definição do serviço de operação para teste de 8 longs
   * </pre>
   */
  public static final class MathServiceFutureStub extends io.grpc.stub.AbstractStub<MathServiceFutureStub> {
    private MathServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private MathServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MathServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new MathServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.long_responseSoma> somaLongs(
        generated.long_request request) {
      return futureUnaryCall(
          getChannel().newCall(getSomaLongsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<generated.long_responseMaior> raizQuadrada(
        generated.long_request request) {
      return futureUnaryCall(
          getChannel().newCall(getRaizQuadradaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SOMA_LONGS = 0;
  private static final int METHODID_RAIZ_QUADRADA = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MathServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MathServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SOMA_LONGS:
          serviceImpl.somaLongs((generated.long_request) request,
              (io.grpc.stub.StreamObserver<generated.long_responseSoma>) responseObserver);
          break;
        case METHODID_RAIZ_QUADRADA:
          serviceImpl.raizQuadrada((generated.long_request) request,
              (io.grpc.stub.StreamObserver<generated.long_responseMaior>) responseObserver);
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

  private static abstract class MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MathServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return generated.UserProtos.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MathService");
    }
  }

  private static final class MathServiceFileDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier {
    MathServiceFileDescriptorSupplier() {}
  }

  private static final class MathServiceMethodDescriptorSupplier
      extends MathServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MathServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MathServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MathServiceFileDescriptorSupplier())
              .addMethod(getSomaLongsMethod())
              .addMethod(getRaizQuadradaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
