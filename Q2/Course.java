package Q2;

import java.util.ArrayList;

public class Course {
    String courseName;
    String courseCode;
    ArrayList<Student> students;
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        students=new ArrayList<>();
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
public void displayCourseDetails() {
        System.out.println("Course Name: " + this.courseName);
        System.out.println("Course Code: " + this.courseCode);
        for (Student student : this.students) {
            student.displayStudentDetails();
        }
}
}
