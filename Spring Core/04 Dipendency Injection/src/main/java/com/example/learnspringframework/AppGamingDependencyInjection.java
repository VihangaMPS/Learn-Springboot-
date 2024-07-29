package com.example.learnspringframework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class YourBusinessClass {

    @Autowired // Dependency Injection - Field Injection(Default)
    DependencyInjection01 dependencyInjection01;

    @Autowired // Dependency Injection - Field Injection(Default)
    DependencyInjection02 dependencyInjection02;

    public String toString() {
        return "Using " + dependencyInjection01 + " and " + dependencyInjection02;
    }

}

@Component
class DependencyInjection01 {

}

@Component
class DependencyInjection02 {

}

@Configuration
@ComponentScan("com.example.learnspringframework")
public class AppGamingDependencyInjection {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppGamingDependencyInjection.class);

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(YourBusinessClass.class));
    }
}
