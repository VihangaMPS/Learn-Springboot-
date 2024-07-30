package com.example.learnspringbootjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private  CourseSpringDataJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(1, "Learn Spring Boot", "Spring Boot"));
        repository.save(new Course(2, "Learn AWS", "AWS"));
        repository.save(new Course(3, "Learn React", "React"));

        repository.deleteById(2l);
    }
}
