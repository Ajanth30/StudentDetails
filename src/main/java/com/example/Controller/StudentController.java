package com.example.Controller;

import com.example.Entity.Student;
import com.example.Services.StudentServices;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServices studentServices;
    private static final Logger logger= LoggerFactory.getLogger(StudentController.class);


    @PostMapping("/students")
    public ResponseEntity<Object>saveStudent(@RequestBody Student student){
        logger.info("StudentController method saveStudents invoked");
        studentServices.saveStudents(student);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping(value ="/students")
    public List<Student>getAllStudents(){
        logger.info("StudentController method getAllStudents invoked");
        return studentServices.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        logger.info("StudentController method getStudentById invoked");
        return studentServices.getStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Object>deleteStudent(@PathVariable("id") int id){
        logger.info("StudentController method deleteStudent invoked");
        studentServices.deleteStudentById(id);
        return new ResponseEntity<>(HttpStatus.GONE);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Object> editStudents(@PathVariable("id") int id,@RequestBody Student student){
        logger.info("StudentController method editStudents invoked");
        return new ResponseEntity<>(studentServices.editStudent(id,student),HttpStatus.OK);
    }



}
