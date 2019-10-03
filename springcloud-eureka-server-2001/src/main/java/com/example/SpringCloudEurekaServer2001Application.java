package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaServer2001Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServer2001Application.class, args);
    }

}
