package com.company;

import java.util.Scanner;
import java.util.*;

/**
 * @author ELKHOLY
 */
public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(s.nextInt());
        student.setName(s.next());
        student.setAge(s.nextInt());
        INFO info = new INFO();
        info.getStudentInfo(student);
    }
}
