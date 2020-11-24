package com.example.demodeploy.controller;

import com.example.demodeploy.model.Student;
import com.example.demodeploy.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public String findAllStudent(Model model) {
        Iterable<Student> students = studentService.findAll();
        model.addAttribute("students", students);
        return "List";
    }
}
