package com.wangyuyang.currencyservice.server;

import com.wangyuyang.currencyservice.grpclib.HealthOuterClass;
import net.devh.boot.grpc.server.service.GrpcService;
import io.grpc.stub.StreamObserver;
import com.wangyuyang.currencyservice.grpclib.HealthGrpc;

@GrpcService
public class HealthImpl extends HealthGrpc.HealthImplBase{
    @Override
    public void check(HealthOuterClass.HealthCheckRequest request, StreamObserver<HealthOuterClass.HealthCheckResponse> responseObserver) {
        HealthOuterClass.HealthCheckResponse healthCheckResponse = HealthOuterClass.HealthCheckResponse.newBuilder().setStatus(HealthOuterClass.HealthCheckResponse.ServingStatus.SERVING).build();
        responseObserver.onNext(healthCheckResponse);
        responseObserver.onCompleted();
    }
}
