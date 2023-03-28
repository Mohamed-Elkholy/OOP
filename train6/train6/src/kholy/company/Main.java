package kholy.company;

import kholy.company.SchoolServices.PrServicesimpl;
import kholy.company.SchoolServices.PuServicesimpl;
import kholy.company.model.Student;

import java.util.Scanner;

public class Main {
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Enter Student of Private School ID ");
        student.setId(s.nextInt());
        System.out.println("Enter Student of Private School Name ");
        student.setName(s.next());
        PrServicesimpl prServicesimpl = new PrServicesimpl();
        prServicesimpl.print(student);
        System.out.println("Enter Student of Public School ID ");
        student.setId(s.nextInt());
        System.out.println("Enter Student of Public School Name ");
        student.setName(s.next());
        PuServicesimpl puServicesimpl = new PuServicesimpl();
        puServicesimpl.print(student);
    }
}