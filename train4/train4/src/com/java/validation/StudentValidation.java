package com.java.validation;

import com.java.model.Student;

public class StudentValidation {

    public static boolean validation(Student student){
        if(student.getId()<0){
            System.out.println("Student ID is invalid");
            return false;
        }
        else if(student.getAge()<7 || student.getAge()>30){
            System.out.println("Student age is invalid");
            return false ;
        }
        return true ;
    }

}
