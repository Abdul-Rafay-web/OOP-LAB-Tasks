package Q4;

import java.util.Scanner;

public class CourseManagementSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the name of the Student");
        String name=scan.nextLine();
        System.out.println("Enter the id of the Student");
        int id=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the program of the Student");
        String program=scan.nextLine();
        Student s1=new Student(name,id,program);
        Student s2=new Student("Faizan",23450,"Computer Science");
        Student s3=new Student("Arham",12566,"Data Science");
        System.out.println("Enter the name of the Course");
        String course=scan.nextLine();
        System.out.println("Enter the Course code");
        String code=scan.nextLine();
        Course course1=new Course(course,code);
        Course course2=new Course("Civics and Community Management","SS-1002");
        System.out.println("Enter the name of the Instructor");
        String instructor=scan.nextLine();
        System.out.println("Enter the id of the Instructor");
        int instructorID=scan.nextInt();
        scan.nextLine();
        Instructor instructor1=new Instructor(instructor,instructorID);
        Instructor instructor2=new Instructor("Ali Akbar",2213);
        course1.assignInstructor(instructor1);
        course2.assignInstructor(instructor2);
        course1.addStudent(s1);
        course1.addStudent(s2);
        course2.addStudent(s3);
        s1.enrollCourse(course1);
        s2.enrollCourse(course1);
        s3.enrollCourse(course2);
        course1.displayCourse();
        course2.displayCourse();
    }
}
