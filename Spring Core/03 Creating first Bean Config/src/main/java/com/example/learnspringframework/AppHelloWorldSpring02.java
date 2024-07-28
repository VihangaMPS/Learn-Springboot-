package com.example.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring02 {
    public static void main(String[] args) {

        // 1) Launch a Spring Context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloWorldConfig.class);


        // 2) Configure the things that we want Spring to manage - @Configuration
        System.out.println(context.getBean("name")); // using name
        System.out.println(context.getBean("age"));

        System.out.println(context.getBean("person")); // using name
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean("person3Parameter"));
        System.out.println(context.getBean("person4Parameter"));

        System.out.println(context.getBean("myAddress")); // using custom name
        // System.out.println(context.getBean(Address.class)); // using type

    }
}
