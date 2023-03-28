package com.java.modelservices;

import com.java.model.Student;
import com.java.validation.StudentValidation;

public class StudentServicesimpl implements StudentServices{
    @Override
    public void print(Student student) {
        if(StudentValidation.validation(student)){
            System.out.println("Student ID is " + student.getId());
            System.out.println("Student name is " + student.getName());
            System.out.println("Student number is " + student.getAge());
        }
    }
}
