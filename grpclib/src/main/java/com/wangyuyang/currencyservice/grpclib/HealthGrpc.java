package com.wangyuyang.currencyservice.grpclib;

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
    value = "by gRPC proto compiler (version 1.32.1)",
    comments = "Source: health.proto")
public final class HealthGrpc {

  private HealthGrpc() {}

  public static final String SERVICE_NAME = "grpc.health.v1.Health";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest,
      com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Check",
      requestType = com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest.class,
      responseType = com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest,
      com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest, com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse> getCheckMethod;
    if ((getCheckMethod = HealthGrpc.getCheckMethod) == null) {
      synchronized (HealthGrpc.class) {
        if ((getCheckMethod = HealthGrpc.getCheckMethod) == null) {
          HealthGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest, com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HealthMethodDescriptorSupplier("Check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HealthStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthStub>() {
        @java.lang.Override
        public HealthStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthStub(channel, callOptions);
        }
      };
    return HealthStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HealthBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthBlockingStub>() {
        @java.lang.Override
        public HealthBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthBlockingStub(channel, callOptions);
        }
      };
    return HealthBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HealthFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HealthFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HealthFutureStub>() {
        @java.lang.Override
        public HealthFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HealthFutureStub(channel, callOptions);
        }
      };
    return HealthFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HealthImplBase implements io.grpc.BindableService {

    /**
     */
    public void check(com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest,
                com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse>(
                  this, METHODID_CHECK)))
          .build();
    }
  }

  /**
   */
  public static final class HealthStub extends io.grpc.stub.AbstractAsyncStub<HealthStub> {
    private HealthStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthStub(channel, callOptions);
    }

    /**
     */
    public void check(com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest request,
        io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HealthBlockingStub extends io.grpc.stub.AbstractBlockingStub<HealthBlockingStub> {
    private HealthBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse check(com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HealthFutureStub extends io.grpc.stub.AbstractFutureStub<HealthFutureStub> {
    private HealthFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HealthFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HealthFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse> check(
        com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CHECK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HealthImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HealthImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CHECK:
          serviceImpl.check((com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckRequest) request,
              (io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.HealthOuterClass.HealthCheckResponse>) responseObserver);
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

  private static abstract class HealthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HealthBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wangyuyang.currencyservice.grpclib.HealthOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Health");
    }
  }

  private static final class HealthFileDescriptorSupplier
      extends HealthBaseDescriptorSupplier {
    HealthFileDescriptorSupplier() {}
  }

  private static final class HealthMethodDescriptorSupplier
      extends HealthBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HealthMethodDescriptorSupplier(String methodName) {
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
      synchronized (HealthGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HealthFileDescriptorSupplier())
              .addMethod(getCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
