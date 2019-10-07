package com.example.business.impl;

import com.example.business.service.PeopleService;
import org.springframework.stereotype.Service;

@Service("peopleServiceImpl")
public class PeopleServiceImpl implements PeopleService {

    public String hello(){
        return "hello world  - 1003";
    }

    @Override
    public String getinfo() {
        try {
            Thread.sleep(2000);//模拟阻塞
        }catch (Exception e){
            e.printStackTrace();
        }
        return "getinfo-1003";
    }
}
