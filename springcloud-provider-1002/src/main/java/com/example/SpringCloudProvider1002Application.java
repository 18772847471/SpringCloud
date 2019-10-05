package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProvider1002Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudProvider1002Application.class, args);
    }

}
