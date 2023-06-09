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
    comments = "Source: CurrencyService.proto")
public final class CurrencyServiceGrpc {

  private CurrencyServiceGrpc() {}

  public static final String SERVICE_NAME = "hipstershop.CurrencyService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty,
      com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse> getGetSupportedCurrenciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSupportedCurrencies",
      requestType = com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty.class,
      responseType = com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty,
      com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse> getGetSupportedCurrenciesMethod() {
    io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty, com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse> getGetSupportedCurrenciesMethod;
    if ((getGetSupportedCurrenciesMethod = CurrencyServiceGrpc.getGetSupportedCurrenciesMethod) == null) {
      synchronized (CurrencyServiceGrpc.class) {
        if ((getGetSupportedCurrenciesMethod = CurrencyServiceGrpc.getGetSupportedCurrenciesMethod) == null) {
          CurrencyServiceGrpc.getGetSupportedCurrenciesMethod = getGetSupportedCurrenciesMethod =
              io.grpc.MethodDescriptor.<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty, com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSupportedCurrencies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new CurrencyServiceMethodDescriptorSupplier("GetSupportedCurrencies"))
              .build();
        }
      }
    }
    return getGetSupportedCurrenciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest,
      com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money> getConvertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Convert",
      requestType = com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest.class,
      responseType = com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest,
      com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money> getConvertMethod() {
    io.grpc.MethodDescriptor<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest, com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money> getConvertMethod;
    if ((getConvertMethod = CurrencyServiceGrpc.getConvertMethod) == null) {
      synchronized (CurrencyServiceGrpc.class) {
        if ((getConvertMethod = CurrencyServiceGrpc.getConvertMethod) == null) {
          CurrencyServiceGrpc.getConvertMethod = getConvertMethod =
              io.grpc.MethodDescriptor.<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest, com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Convert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money.getDefaultInstance()))
              .setSchemaDescriptor(new CurrencyServiceMethodDescriptorSupplier("Convert"))
              .build();
        }
      }
    }
    return getConvertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CurrencyServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceStub>() {
        @java.lang.Override
        public CurrencyServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyServiceStub(channel, callOptions);
        }
      };
    return CurrencyServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CurrencyServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceBlockingStub>() {
        @java.lang.Override
        public CurrencyServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyServiceBlockingStub(channel, callOptions);
        }
      };
    return CurrencyServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CurrencyServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CurrencyServiceFutureStub>() {
        @java.lang.Override
        public CurrencyServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CurrencyServiceFutureStub(channel, callOptions);
        }
      };
    return CurrencyServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CurrencyServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSupportedCurrencies(com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSupportedCurrenciesMethod(), responseObserver);
    }

    /**
     */
    public void convert(com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest request,
        io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money> responseObserver) {
      asyncUnimplementedUnaryCall(getConvertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSupportedCurrenciesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty,
                com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse>(
                  this, METHODID_GET_SUPPORTED_CURRENCIES)))
          .addMethod(
            getConvertMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest,
                com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money>(
                  this, METHODID_CONVERT)))
          .build();
    }
  }

  /**
   */
  public static final class CurrencyServiceStub extends io.grpc.stub.AbstractAsyncStub<CurrencyServiceStub> {
    private CurrencyServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSupportedCurrencies(com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSupportedCurrenciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void convert(com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest request,
        io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CurrencyServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CurrencyServiceBlockingStub> {
    private CurrencyServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse getSupportedCurrencies(com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetSupportedCurrenciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money convert(com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest request) {
      return blockingUnaryCall(
          getChannel(), getConvertMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CurrencyServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CurrencyServiceFutureStub> {
    private CurrencyServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CurrencyServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CurrencyServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse> getSupportedCurrencies(
        com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSupportedCurrenciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money> convert(
        com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getConvertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SUPPORTED_CURRENCIES = 0;
  private static final int METHODID_CONVERT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CurrencyServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CurrencyServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SUPPORTED_CURRENCIES:
          serviceImpl.getSupportedCurrencies((com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.GetSupportedCurrenciesResponse>) responseObserver);
          break;
        case METHODID_CONVERT:
          serviceImpl.convert((com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.CurrencyConversionRequest) request,
              (io.grpc.stub.StreamObserver<com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.Money>) responseObserver);
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

  private static abstract class CurrencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CurrencyServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.wangyuyang.currencyservice.grpclib.CurrencyServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CurrencyService");
    }
  }

  private static final class CurrencyServiceFileDescriptorSupplier
      extends CurrencyServiceBaseDescriptorSupplier {
    CurrencyServiceFileDescriptorSupplier() {}
  }

  private static final class CurrencyServiceMethodDescriptorSupplier
      extends CurrencyServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CurrencyServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CurrencyServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CurrencyServiceFileDescriptorSupplier())
              .addMethod(getGetSupportedCurrenciesMethod())
              .addMethod(getConvertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
