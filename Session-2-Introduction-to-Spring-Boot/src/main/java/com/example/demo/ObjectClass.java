package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ObjectClass {

    @Autowired
    @Qualifier("tennisCoach")
    private Coach coach;

    public String hello(){
        return coach.Play();
    }
}
