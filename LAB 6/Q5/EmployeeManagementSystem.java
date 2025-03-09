package Q5;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        System.out.println("Enter the name of employee: ");
        String name = scan.nextLine();
        System.out.println("Enter the salary of the employees: ");
        double salary = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter the department of the employees: ");
        String department = scan.nextLine();
        System.out.println("Enter the employee ID: ");
        int id = scan.nextInt();
        scan.nextLine();
        Employee e1=new Employee(name,id,salary,department);
        employees.add(e1);
        Employee e2=new Employee("Abdul Rafay Tariq",234,250000,"AI Engineer");
        employees.add(e2);
        System.out.println("Enter the Department of the Employee to Search: ");
        String dept = scan.nextLine();
        int found=0;
        for (Employee emp : employees) {
            if (emp.getEmployeeDept().trim().equalsIgnoreCase(dept.trim())) {
                found++;
                emp.displayEmployee();
                break;
            }
        }
        if (found ==0) {
            System.out.println("Employee not found");
        }
        double sum=0;
        for (Employee emp : employees) {
            sum+=emp.getSalary();
        }
        double averageSalary=sum/employees.size();
        System.out.println("Average Employee Salary: " + averageSalary);
    }
}
