package Q4;

import java.util.ArrayList;

public class Student {
    private String name;
    private int id;
    private String program;
    private ArrayList<Course> courses;
    public Student(String name, int id, String program) {
        this.name = name;
        this.id = id;
        this.program = program;
        this.courses = new ArrayList<>();
    }
    public void enrollCourse(Course course) {
        this.courses.add(course);
    }
    public void displayStudent() {
        System.out.println("Student Name: " + name);
    }
}
