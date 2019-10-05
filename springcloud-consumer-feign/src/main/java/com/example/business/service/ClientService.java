package com.example.business.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="springcloud-provider")
public interface ClientService {

    @GetMapping(value="/springcloud-provider/people/hello")
    public String hello();
}
