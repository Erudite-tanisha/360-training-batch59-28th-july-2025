package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class CricketCoach implements Coach{

    SportsKit kit;

    public CricketCoach(@Autowired SportsKit kit) { // constructor based DI
        this.kit = kit;
    }

    @Override
    public String Play() {
        return "Playing Cricket!!";
    }

    @Override
    public String kitGranted() {
        return kit.kitGranted();
    }
}
