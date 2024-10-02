package com.practice_project.demo;

import com.practice_project.demo.Entity.Student;
import com.practice_project.demo.dao.StudentDAO;
import com.practice_project.demo.dao.StudentDAOImpl;

import java.util.List;

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
            //createStudent(studentDAO);
            //readStudent(studentDAO);
            readAllStudents(studentDAO);
        };
    }

    private void readAllStudents(StudentDAO studentDAO) {
        List<Student> studList = studentDAO.findAll();
        for (Student student : studList) {
            System.out.println(student);
        }
    }

    private void readStudent(StudentDAO studentDAO) {
        Student tempStudent = studentDAO.findById(2);
        System.out.println("I found a student: "+tempStudent);
    }

    private void createStudent(StudentDAO studentDAO) {
        //Student tempStudent = new Student("suraj", "ratnaparkhi", "sr@gmail.com");
        Student tempStudent = new Student("akash", "deulkar", "ad@gmail.com");

        studentDAO.save(tempStudent);
    }
}
