package com.n2s.cllient2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableDiscoveryClient
public class Cllient2Application {

    public static void main(String[] args) {
        SpringApplication.run(Cllient2Application.class, args);
    }

}
