package com.example.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring02 {
    public static void main(String[] args) {

        // 1) Launch a Spring Context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);


        // 2) Configure the things that we want Spring to manage - @Configuration
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person"));

    }
}
