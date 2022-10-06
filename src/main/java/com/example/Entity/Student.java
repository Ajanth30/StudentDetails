package com.example.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "Student_Details")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String firstName;
    private String lastName;
    private String age;
    private String gender;
}
