package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public StudentDTO getStudent() {
        return repository.getStudent();
    }

    public StudentDTO updateStudent() {
        return repository.updateStudent();
    }

    public String deleteStudent() {
        return repository.deleteStudent();
    }
}