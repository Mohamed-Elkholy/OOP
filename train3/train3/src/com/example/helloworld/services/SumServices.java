package com.example.helloworld.services;

import com.example.helloworld.model.Sum;
import com.example.helloworld.validate.Validation;

public class SumServices {

    public int printSum(Sum sum){
        if(Validation.valid(sum)) {
            return sum.getNumber1() + sum.getNumber2() + sum.getNumber3();
        }
        return -1 ;
    }

}



