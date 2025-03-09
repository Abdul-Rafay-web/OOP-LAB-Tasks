package Q8;

import java.util.Scanner;

public class ProjectManagementSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter Project Name: ");
        String name = scan.nextLine();
        System.out.println("Enter Project ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Project Deadline: ");
        String deadline = scan.nextLine();
        Project project1= new Project(name,id,deadline);
        Project project2= new Project("OOP LAB ",234,"28-April-2025");
    Project.displayProjects();
    }
}
