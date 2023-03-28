package kholy.com.Services;

import kholy.com.model.Student;

public class SchoolServiceImpl3 extends SchoolServiceImpl1{
    @Override
    public void showStudent(Student student) {
        System.out.println("Now , I'm in Show Student");
        System.out.println("Student ID "+ student.getId());
        System.out.println("Student Name "+ student.getName());
    }
}
