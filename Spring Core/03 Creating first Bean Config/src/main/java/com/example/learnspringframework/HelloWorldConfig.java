package com.example.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


// Record is release in JDK 16
// Eliminate verbosity in creating Java Beans
// Automatically created Getter Setter Methods, Constructor, equals, hashcode and toString
record Person(String name, int age) {}

@Configuration
public class HelloWorldConfig {

    @Bean
    public String name() {
        return "Hello World";
    }

    @Bean
    public int age() {
        return 20;
    }

    @Bean
    public Person person() {
        return new Person("John", 18);
    }
}
