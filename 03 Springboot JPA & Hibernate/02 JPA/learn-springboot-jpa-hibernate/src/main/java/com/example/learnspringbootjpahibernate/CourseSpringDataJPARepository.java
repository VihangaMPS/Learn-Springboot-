package com.example.learnspringbootjpahibernate;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJPARepository extends JpaRepository<Course, Long> {
}
