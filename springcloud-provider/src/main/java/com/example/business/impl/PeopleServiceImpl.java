package com.example.business.impl;

import com.example.business.service.PeopleService;
import org.springframework.stereotype.Service;

@Service("peopleServiceImpl")
public class PeopleServiceImpl implements PeopleService {

    public String hello(){
        return "hello world";
    }
}
