package com.example.helloworld;

import com.example.helloworld.model.Sum;
import com.example.helloworld.services.SumServices;

import java.util.Scanner;

public class HelloWorld {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.setNumber1(s.nextInt());
        sum.setNumber2(s.nextInt());
        sum.setNumber3(s.nextInt());
        SumServices sumservices = new SumServices();
        System.out.println("Sum = " +  sumservices.printSum(sum));
    }
}
