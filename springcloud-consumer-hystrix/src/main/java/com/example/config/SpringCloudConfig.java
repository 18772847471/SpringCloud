package com.example.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpringCloudConfig {
    /**
     * 自定义轮询算法
     * @return
     */
    @Bean
    public IRule myRule(){
        return new RetryRule();
    }
}
