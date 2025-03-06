package Q2;

public class Assignment {
    String assignmentName;
    String assignmentDueDate;
    String assignmentDescription;
    Course course;
    public Assignment(String assignmentName, String assignmentDueDate, String assignmentDescription, Course course) {
        this.assignmentName = assignmentName;
        this.assignmentDueDate = assignmentDueDate;
        this.assignmentDescription = assignmentDescription;
        this.course = course;
    }
    public void displayAssignmentDetails() {
        System.out.println("Assignment Name: " + assignmentName);
        System.out.println("Assignment Due Date: " + assignmentDueDate);
        System.out.println("Assignment Description: " + assignmentDescription);
    }
}
