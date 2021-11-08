package com.example.service;

import com.example.entity.Entity0001;
import com.example.repository.Entity0001Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    Entity0001Repository repo;

    public void runDemo(){
        Entity0001 e = new Entity0001();
		e.setId(0L);
		e.setCode("MyCode");
		repo.save(e);
		//System.out.println("Code :" + repo.findAll().get(0).getCode());  // <-- Here got problem
    }
    
}
