package Q4;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseCode;
    private ArrayList<Student> students;
    Instructor instructor;
    public Course(String courseName, String courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new ArrayList<>();
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
    public void assignInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    public void displayCourse() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Students Enrolled: ");
        for (Student student : students) {
            student.displayStudent();
        }
        System.out.println("Instructor: " + instructor.getInstructorName());
    }
}
