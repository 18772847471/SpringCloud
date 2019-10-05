package com.example.business.impl;

import com.example.business.service.ClientService;
import com.example.business.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("peopleServiceImpl")
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    private ClientService clientService;

    @Override
    public String hello() {
        return clientService.hello();
    }
}
