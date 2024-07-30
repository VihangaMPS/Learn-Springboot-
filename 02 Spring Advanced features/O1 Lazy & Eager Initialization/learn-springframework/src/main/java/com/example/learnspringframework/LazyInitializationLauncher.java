package com.example.learnspringframework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class ClassA {

}

@Component
class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        System.out.println("Some Initialization Logic");
        this.classA = classA;
    }

    public void doSomething() {
        System.out.println("doSomething ...");
    }
}


@Configuration
@ComponentScan
public class LazyInitializationLauncher {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[]{LazyInitializationLauncher.class});

        System.out.println("Lazy Initialization of Context is created ");

        context.getBean(ClassB.class).doSomething();
    }
}
