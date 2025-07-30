package com.example.demo.config;

import com.example.demo.Animal;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Animal animal(){
        return new Animal();
    }


}
