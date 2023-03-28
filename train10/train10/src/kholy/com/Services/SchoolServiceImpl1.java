package kholy.com.Services;

import kholy.com.model.Student;

public abstract class SchoolServiceImpl1 implements SchoolService {

    @Override
    public Student saveStudent(Student student) {
        return student;
    }

    @Override
    public void showStudent(Student student) {
        System.out.println("Student ID "+ student.getId());
        System.out.println("Student Name "+ student.getName());
    }
}
