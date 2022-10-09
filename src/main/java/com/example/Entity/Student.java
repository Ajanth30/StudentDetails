package com.example.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String firstName;
    private String lastName;
    private String age;
    private String gender;
    @OneToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL,mappedBy = "student",targetEntity = Student_Details.class)
    @JoinColumn(name = "detail_Id",referencedColumnName = "id")
    private Student_Details studentDetails;


}
