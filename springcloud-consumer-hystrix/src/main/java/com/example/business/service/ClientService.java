package com.example.business.service;

import com.example.business.fallbackfactory.ClientFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="springcloud-provider",fallbackFactory=ClientFallbackFactory.class)
public interface ClientService {

    @GetMapping(value="/springcloud-provider/people/hello")
    public String hello();

    @GetMapping(value="/springcloud-provider/people/getinfo")
    public String getinfo();
}
