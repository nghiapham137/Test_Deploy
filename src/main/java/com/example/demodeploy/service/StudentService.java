package com.example.demodeploy.service;

import com.example.demodeploy.model.Student;

public interface StudentService {
    Iterable<Student> findAll();
    void saveStudent(Student student);
}
