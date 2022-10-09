package com.example.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student_Details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int grade;
    private String division;
    private String reg_num;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    private Student student;
}
