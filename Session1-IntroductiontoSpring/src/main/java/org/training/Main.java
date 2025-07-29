package org.training;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        CricketCoach c1 = new CricketCoach();
//        System.out.println(c1.Play());

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        ScoreBoard c1 = (ScoreBoard) context.getBean("coach1");

        ScoreBoard c2 = (ScoreBoard) context.getBean("coach1");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());



//        System.out.println(c2.Play());
//        System.out.println(c1.kitGranted());

//        System.out.println(c2.kitGranted());


        }
    }
