package com.example.learnspringbootjpahibernate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

        private static String INSERT_QUERY = "INSERT INTO course(id, name, author) VALUES (?, ?, ?)";

        private static String DELETE_QUERY = "DELETE FROM course WHERE id = ?";

    public void insert(Course course) {
        jdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
    }

    public void deleteById(int id) {
        jdbcTemplate.update(DELETE_QUERY, id);
    }
}
