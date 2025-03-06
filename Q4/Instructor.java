package Q4;

import java.util.ArrayList;

public class Instructor {
   private String instructorName;
   private int instructorID;
    private ArrayList<Course> courses;
    public Instructor(String instructorName,int instructorID) {
        this.instructorName = instructorName;
        this.instructorID = instructorID;
        this.courses = new ArrayList<>();
    }
    public void addCourse(Course course) {
        courses.add(course);
    }
    public String getInstructorName() {
        return instructorName;
    }
    public void displayInstructor() {
        System.out.println("Name: " + instructorName);
        for (Course course : courses) {
            course.displayCourse();
        }
    }
}
