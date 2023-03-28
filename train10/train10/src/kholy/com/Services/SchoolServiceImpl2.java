package kholy.com.Services;

import kholy.com.model.Student;

public class SchoolServiceImpl2 extends SchoolServiceImpl1{
    @Override
    public Student saveStudent(Student student) {
        System.out.println("Now , I'm in SavaStudent");
        return student;
    }
}
