package com.riya.demo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")

public class StudentController {
    private final StudentRepo studentRepository;

    public StudentController(StudentRepo studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        return studentRepository.addStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudentsByUniversity(@RequestParam String university) {
        return studentRepository.getAllStudentsByUniversity(university);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable String id) {
        return studentRepository.getStudentById(id);
    }
}
