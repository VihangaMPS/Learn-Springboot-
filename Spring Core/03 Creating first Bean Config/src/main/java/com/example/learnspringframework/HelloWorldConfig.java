package com.example.learnspringframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


// Record is release in JDK 16
// Eliminate verbosity in creating Java Beans
// Automatically created Getter Setter Methods, Constructor, equals, hashcode and toString
record Person(String name, int age, Address address) {}

record Address(String city, String country) {}

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
        return new Person("John", 18, new Address("Colombo", "Sri Lanka"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address());
    }
    @Bean
    public Person person3Parameter(String name, int age, Address myAddress) {
        return new Person(name, age, myAddress);
    }
    @Bean
    public Person person4Parameter(String name, int age, Address address) {
        return new Person(name, age, address);
    }

    @Bean(name = "myAddress")
    @Primary
    public Address address() {
        return new Address("San Francisco", "USA");
    }
    @Bean(name = "myWork")
    public Address address2() {
        return new Address("Ontario", "London");
    }
}
