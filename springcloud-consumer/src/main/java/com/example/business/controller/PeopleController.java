package com.example.business.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;


@RequestMapping("/v/people")
@RestController
public class PeopleController {
    private static String PEOPLE_HELLO= "http://localhost:1000/springcloud-provider/people/hello";

    @Resource
    private RestTemplate restTemplate;

    @ApiOperation(value = "hello接口",notes = "hello接口")
    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    public String hello(){
        return restTemplate.getForObject(PEOPLE_HELLO, String.class);
    }

}
