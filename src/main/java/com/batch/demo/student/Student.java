package com.batch.demo.student;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
public class Student {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private int age;
}