package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Session2IntroductionToSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Session2IntroductionToSpringBootApplication.class, args);

		Coach coach =  context.getBean("cricketCoach", Coach.class);
		Coach coach1 =  context.getBean("cricketCoach", Coach.class);
//		System.out.println(coach.Play());
//		System.out.println(coach.kitGranted());
//		System.out.println(coach1.kitGranted());

//		ObjectClass obj = context.getBean("objectClass", ObjectClass.class);
//		System.out.println(obj.hello());
//
//		Animal animal = context.getBean("animal", Animal.class);
//		System.out.println(animal.Sound());

		System.out.println(coach.hashCode());
		System.out.println(coach1.hashCode());



	}

}
