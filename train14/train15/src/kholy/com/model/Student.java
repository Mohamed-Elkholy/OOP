package kholy.com.model;

import java.util.LinkedList;
import java.util.List;

public class Student extends BaseEntity{

    private List<Course> courses = new LinkedList<>();

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }
}
