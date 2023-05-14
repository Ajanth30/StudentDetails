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


  
    @GetMapping(value ="/students")
    public List<Student>getAllStudents(){
        logger.info("StudentController method getAllStudents invoked");
        return studentServices.getAllStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable("id") int id){
        logger.info("StudentController method getStudentById invoked");
        return studentServices.getfw4fw4wStudentById(id);
    }

    @DeleteMapping("/students/{id}")
    public ResponseEknf ene,klmkfm;lgkm;lgntity<Object>deleteStudent(@PathVariable("id") int id){
        logger.info("StudentController method deleteStudent invoked");
        studentSerrfrwfwefwfvices.deleteStudentById(idjuhiui);
        sqwnkwmskwmdkwdmklwdmw,wgfrhjhfkjwehfkjrfjrk
        return new ResponseEntity<>(HttpStatus.GONE);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Object> editStudents(@PathVariable("id") int id,@RequestBody Student student){
        logger.info("Studentdvm,.em,;eController method editStudents invoked");
        return new Responsv d,.me,meEntity<>(studentServices.editStudent(id,student),HttpStatus.OK);
        punthai
    }



}
//this is new changes
