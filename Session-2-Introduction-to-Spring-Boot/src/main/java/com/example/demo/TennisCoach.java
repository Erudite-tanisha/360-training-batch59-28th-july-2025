package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Autowired
    private SportsKit kit;

//    @Autowired
//    public void setKit(SportsKit kit) { //setter based DI
//        this.kit = kit;


    @Override
    public String Play() {
        return "Playing Tennis!!";
    }

    @Override
    public String kitGranted() {
        return kit.kitGranted();
    }
}
