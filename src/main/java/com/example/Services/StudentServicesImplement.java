package com.example.Services;

import com.example.Controller.StudentController;
import com.example.Entity.Student;
import com.example.Repository.StudentRepository;
import com.example.Services.StudentServices;
import net.bytebuddy.implementation.bytecode.Throw;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
@Service
public class StudentServicesImplement implements StudentServices {
    @Autowired
    private StudentRepository studentRepository;
    private static final Logger logger= LoggerFactory.getLogger(StudentServicesImplement.class);

    @Override
    public void saveStudents(Student student) {
        logger.info("StudentServicesImplement method saveStudents invoked",student);
        studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        logger.info("StudentServicesImplement method getAllStudents invoked");
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        logger.info("StudentServicesImplement method getStudentById invoked",id);
        return studentRepository.findById(id).orElseThrow(()->new SourceNotFoundException());
    }

    @Override
    public void deleteStudentById(int id) {
        logger.info("StudentServicesImplement method deleteStudentById invoked",id);
        if(studentRepository.existsById(id)){
            studentRepository.deleteById(id);
        }else {
            throw new RuntimeException();
        }


    }
    @Override
    public Student editStudent(int id,Student student) {
        logger.info("StudentServicesImplement method editStudent invoked",id,student);
        Student student1=studentRepository.findById(id).orElseThrow(()-> new SourceNotFoundException());
        student1.setFirstName(student.getFirstName());
        student1.setLastName(student.getLastName());
        student1.setGender(student.getGender());
        student1.setAge(student.getAge());
        studentRepository.save(student1);
        return student1;
    }

}
