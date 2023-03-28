package kholy.com.model;

import java.util.LinkedList;
import java.util.List;

public class Course extends BaseEntity{

    private List<Student> students = new LinkedList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
