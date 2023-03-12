package com.wangyuyang.currencyservice.server;

import net.devh.boot.grpc.server.autoconfigure.GrpcHealthServiceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {GrpcHealthServiceAutoConfiguration.class})
public class ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }
}