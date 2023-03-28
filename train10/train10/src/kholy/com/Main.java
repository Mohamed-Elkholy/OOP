package kholy.com;

import kholy.com.Services.SchoolService;
import kholy.com.Services.SchoolServiceImpl1;
import kholy.com.Services.SchoolServiceImpl2;
import kholy.com.Services.SchoolServiceImpl3;
import kholy.com.model.Student;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(1);
        student.setName(s.next());

        SchoolService schoolService = new SchoolServiceImpl2();
        System.out.println(schoolService.saveStudent(student).getName());
        schoolService.showStudent(student);
        SchoolService schoolService2 = new SchoolServiceImpl3();
        System.out.println(schoolService2.saveStudent(student).getName());
        schoolService2.showStudent(student);

    }
}