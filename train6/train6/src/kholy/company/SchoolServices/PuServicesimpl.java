package kholy.company.SchoolServices;

import kholy.company.model.Student;

public class PuServicesimpl implements StudentServices{
    @Override
    public void print(Student student) {
        System.out.println("Public School ID is " + student.getId());
        System.out.println("Public School name is " + student.getName());
    }
}
