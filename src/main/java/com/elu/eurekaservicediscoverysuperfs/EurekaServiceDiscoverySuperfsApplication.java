package com.elu.eurekaservicediscoverysuperfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceDiscoverySuperfsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceDiscoverySuperfsApplication.class, args);
    }

}
