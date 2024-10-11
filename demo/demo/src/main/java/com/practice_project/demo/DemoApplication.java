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
            //readAllStudents(studentDAO);
            //readStudentsByLastName(studentDAO);
            //updateStudent(studentDAO);
            //deleteStudent(studentDAO);
            deleteAllStudent(studentDAO);
        };
    }

    private void deleteAllStudent(StudentDAO studentDAO) {
        int number = studentDAO.deleteAllStudents();
        System.out.println("Number of deleted students: "+number);
    }

    private void deleteStudent(StudentDAO studentDAO) {
        int id = 3;
        Student student = studentDAO.findById(id);
        System.out.println("deleting student with id: "+id+" :: "+student);
        studentDAO.delete(id);
    }

    private void updateStudent(StudentDAO studentDAO) {
        int studentID=1;
        Student theStudent = studentDAO.findById(studentID);
        System.out.println("Updating student: "+theStudent);
        theStudent.setFirstName("Dhanu");
        studentDAO.update(theStudent);
        Student sameStudent = studentDAO.findById(studentID);
        System.out.println("After update: "+sameStudent);
    }

    private void readStudentsByLastName(StudentDAO studentDAO) {
        List<Student> studList = studentDAO.findByLastName("deulkar");
        for(Student tempStud:studList)
        {
            System.out.println(tempStud);
        }
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
