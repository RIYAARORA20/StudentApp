package com.riya.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryStudent implements StudentRepo{
    private Map<String, Student> students = new HashMap<>();

    @Override
    public String addStudent(Student student) {
        String id = generateId(); 
        student.setId(id);
        students.put(id, student);
        return id;
    }

    @Override
    public List<Student> getAllStudentsByUniversity(String university) {
        List<Student> result = new ArrayList<>();
        for (Student student : students.values()) {
            if (student.getUniversity().equals(university)) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public Student getStudentById(String id) {
        return students.get(id);
    }

    // Additional methods for generating IDs, if needed
    private String generateId() {
        // Implementation to generate unique IDs
    }
}
