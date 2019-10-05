package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class SpringCloudConfig {
    /**
     * 调用服务模版
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
