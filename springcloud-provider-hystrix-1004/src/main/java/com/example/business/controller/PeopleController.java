package com.example.business.controller;

import com.example.business.service.PeopleService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/people")
public class PeopleController {

    @Resource(name = "peopleServiceImpl")
    private PeopleService  peopleServiceImpl;

    @ApiOperation(value = "hello接口",notes = "hello接口")
    @RequestMapping(value ="/hello", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="getHelloFallback")
    public String hello(){
        return peopleServiceImpl.hello();
    }

    @ApiOperation(value = "getinfo接口",notes = "getinfo接口")
    @RequestMapping(value ="/getinfo", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod="getInfoFallback")
    public String getinfo(){
        return peopleServiceImpl.getinfo();
    }

    public String getHelloFallback(){
        return "getHelloFallback";
    }

    public String getInfoFallback(){
        return "getInfoFallback";
    }

}
