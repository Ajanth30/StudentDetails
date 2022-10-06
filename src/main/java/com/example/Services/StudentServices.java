package com.example.Services;

import com.example.Entity.Student;

import java.util.List;
public interface StudentServices {
    void saveStudents(Student student);
    List<Student>getAllStudents();
    Student getStudentById(int id);
    void deleteStudentById(int id);
    Student editStudent(int id,Student student);
}
