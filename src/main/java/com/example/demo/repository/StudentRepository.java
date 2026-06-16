package com.example.demo.repository;

import com.example.demo.dto.StudentDTO;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepository {

    public StudentDTO getStudent() {
        return new StudentDTO(1, "Siddh", "Java");
    }

    public StudentDTO updateStudent() {
        return new StudentDTO(1, "Updated Siddh", "Spring Boot");
    }

    public String deleteStudent() {
        return "Student Deleted Successfully";
    }
}