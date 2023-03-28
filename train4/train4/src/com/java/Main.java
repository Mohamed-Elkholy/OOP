package com.java;

import com.java.model.Player;
import com.java.model.Student;
import com.java.modelservices.PlayerServices;
import com.java.modelservices.PlayerServicesimpl;
import com.java.modelservices.StudentServicesimpl;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Player player = new Player();
        System.out.println("Enter player ID");
        player.setId(s.nextInt());
        System.out.println("Enter player Name");
        player.setName(s.next());
        System.out.println("Enter player Number");
        player.setNumber(s.nextInt());
        Student student = new Student();
        System.out.println("Enter student ID");
        student.setId(s.nextInt());
        System.out.println("Enter student Name");
        student.setName(s.next());
        System.out.println("Enter student Age");
        student.setAge(s.nextInt());
        PlayerServicesimpl playerServices = new PlayerServicesimpl();
        playerServices.print(player);
        StudentServicesimpl studentServices = new StudentServicesimpl();
        studentServices.print(student);
    }
}