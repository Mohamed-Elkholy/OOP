package kholy.com;

import kholy.com.model.Course;
import kholy.com.model.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setName("Mohamed");

        Student student2 = new Student();
        student2.setId(2);
        student2.setName("Ahmed");

        Course course1 = new Course();
        course1.setId(11);
        course1.setName("Database");

        Course course2 = new Course();
        course2.setId(12);
        course2.setName("Web");

        student1.getCourses().add(course1);
        student2.getCourses().add(course1);
        student2.getCourses().add(course2);

        course1.getStudents().add(student1);
        course1.getStudents().add(student2);
        course2.getStudents().add(student2);

        System.out.println(student1.getCourses().size());
        System.out.println(student2.getCourses().size());

        System.out.println(course1.getStudents().size());
        System.out.println(course2.getStudents().size());

        System.out.println(student2.getCourses().get(1).getName());
    }
}