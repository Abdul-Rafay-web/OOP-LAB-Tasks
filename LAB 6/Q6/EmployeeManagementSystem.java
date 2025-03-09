package Q6;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        int employeeID = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Employee Name: ");
        String employeeName = scan.nextLine();
        System.out.println("Enter Employee Salary ");
        double salary = scan.nextDouble();
        scan.nextLine();
        Employee e1=new Employee(employeeName,employeeID,salary);
System.out.println("Enter Proficient Programming Language: ");
String programmingLanguage = scan.nextLine();
Developer d1=new Developer(employeeName,employeeID,salary,programmingLanguage);
System.out.println("Enter Project Count: ");
int projectCount = scan.nextInt();
scan.nextLine();
SoftwareArchitect sw1=new SoftwareArchitect(employeeName,employeeID,salary,programmingLanguage,projectCount);
sw1.displaySoftwareArchitect();
    }
}
