package com.example.learnspringbootjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJDBCRepository courseJDBCRepository;

    @Override
    public void run(String... args) throws Exception {
        courseJDBCRepository.insert(new Course(1, "Learn Spring Boot", "Spring Boot"));
        courseJDBCRepository.insert(new Course(2, "Learn AWS", "AWS"));
        courseJDBCRepository.insert(new Course(3, "Learn React", "React"));

        courseJDBCRepository.deleteById(2);
    }
}
