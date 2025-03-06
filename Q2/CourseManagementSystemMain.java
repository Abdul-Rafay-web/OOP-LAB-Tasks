package Q2;

import java.util.Scanner;

public class CourseManagementSystemMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1=new Student("Ali Khan",3098);
        Student s2=new Student("Sara Ahmed",3238);
        Course c1=new Course("OOP-LAB ","CS1047");
        Assignment a1=new Assignment("OOP-LAB 5","23-February-2025","Submit All the task in Zip File",c1);
        c1.addStudent(s1);
        c1.addStudent(s2);
        s1.addAssignment(a1);
        s2.addAssignment(a1);
        c1.displayCourseDetails();
    }
}
