package org.rinmakh.eurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDickoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDickoveryApplication.class, args);
    }
}
