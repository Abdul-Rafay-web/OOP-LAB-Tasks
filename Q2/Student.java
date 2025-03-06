package Q2;

import java.util.ArrayList;

public class Student {
    String studentName;
    int studentID;
    ArrayList<Assignment>assignments;
    public Student(String studentName, int studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
        assignments=new ArrayList<>();
    }
    public void addAssignment(Assignment assignment) {
        this.assignments.add(assignment);
    }
    public void displayStudentDetails(){
        System.out.println("Student Name: " + this.studentName);
        System.out.println("Student ID: " + this.studentID);
        for (Assignment assignment : this.assignments) {
            assignment.displayAssignmentDetails();
        }
    }
}
