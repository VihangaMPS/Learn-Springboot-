package com.example.learnspringframework;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass {
    private SomeOtherDependency dependency;

    public SomeClass(SomeOtherDependency dependency) {
        this.dependency = dependency;
        System.out.println("All dependencies are ready");
    }

    @PostConstruct
    public void initialization() {
        dependency.getReady();
    }

    @PreDestroy
    public void destroy() {
        System.out.println("All dependencies are destroyed");
    }
}

@Component
class SomeOtherDependency {

    public void getReady() {
        System.out.println("SomeOtherDependency is ready");
    }
}

@Configuration
@ComponentScan
public class PrePostAnnotationLauncher {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[]{PrePostAnnotationLauncher.class});

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
