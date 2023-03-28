package kholy.company.SchoolServices;

import kholy.company.model.Student;

public class PrServicesimpl implements StudentServices {
    @Override
    public void print(Student student) {
        System.out.println("Private School ID is " + student.getId()) ;
        System.out.println("Private School name is " + student.getName());
    }
}
