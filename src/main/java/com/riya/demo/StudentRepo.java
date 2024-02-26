package com.riya.demo;
import java.util.*;

public interface StudentRepo {
    String addStudent(Student student);
    List<Student> getAllStudentsByUniversity(String university);
    Student getStudentById(String id);
}
