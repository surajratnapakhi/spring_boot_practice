package com.practice_project.demo;

import com.practice_project.demo.Entity.Student;
import com.practice_project.demo.dao.StudentDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner CommandLineRunner(StudentDAO studentDAO)
    {
        return runner -> {
            createStudent(studentDAO);
        };
    }

    private void createStudent(StudentDAO studentDAO) {
        Student tempStudent = new Student("suraj", "ratnaparkhi", "sr@gmail.com");

        studentDAO.save(tempStudent);
    }
}
