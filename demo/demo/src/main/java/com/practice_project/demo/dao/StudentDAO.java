package com.practice_project.demo.dao;

import java.util.List;

import com.practice_project.demo.Entity.Student;

import jakarta.persistence.TypedQuery;

public interface StudentDAO {
    void save(Student theStudent);

    Student findById(Integer id);

    List <Student> findAll();

    List<Student> findByLastName(String lastName);
    void update(Student theStudent);
}
