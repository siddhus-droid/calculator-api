package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/student")
    public StudentDTO getStudent() {
        return service.getStudent();
    }

    @PutMapping("/student")
    public StudentDTO updateStudent() {
        return service.updateStudent();
    }

    @DeleteMapping("/student")
    public String deleteStudent() {
        return service.deleteStudent();
    }
}