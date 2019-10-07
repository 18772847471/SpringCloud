package com.example.business.fallbackfactory;

import com.example.business.service.ClientService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ClientFallbackFactory implements FallbackFactory<ClientService> {
    @Override
    public ClientService create(Throwable throwable) {
        return new ClientService() {
            @Override
            public String hello() {
                return "hello --系统出错，请稍后重试";
            }

            @Override
            public String getinfo() {
                return "getinfo --系统出错，请稍后重试";
            }
        };
    }
}
