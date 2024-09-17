package com.batch.demo.config;


import org.springframework.batch.item.ItemProcessor;

import com.batch.demo.student.Student;

public class StudentProcessor implements ItemProcessor<Student,Student> {

    @Override
    public Student process(Student student) {
        return student;
    }
}