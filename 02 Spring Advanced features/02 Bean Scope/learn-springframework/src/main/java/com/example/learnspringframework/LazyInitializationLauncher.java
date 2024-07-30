package com.example.learnspringframework;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass {

}

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass {

}


@Configuration
@ComponentScan
public class LazyInitializationLauncher {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(new Class[]{LazyInitializationLauncher.class});

        System.out.println("Lazy Initialization of Context is created ");

        System.out.println(context.getBean(NormalClass.class));
        System.out.println(context.getBean(NormalClass.class));

        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
        System.out.println(context.getBean(PrototypeClass.class));
    }
}
