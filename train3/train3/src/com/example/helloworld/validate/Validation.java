package com.example.helloworld.validate;

import com.example.helloworld.model.Sum;

public class Validation {

    public static boolean valid(Sum sum){
        if(sum.getNumber1()%2==1){
            System.out.println("Number 1 is odd");
            return false ;
        }
        else if(sum.getNumber2()%2==1){
            System.out.println("Number 2 is odd");
            return false ;
        }
        else if(sum.getNumber3()%2==1){
            System.out.println("Number 3 is odd");
            return false ;
        }
        return true ;
    }


}
