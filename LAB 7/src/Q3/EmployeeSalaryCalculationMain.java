package Q3;

import java.util.Scanner;

public class EmployeeSalaryCalculationMain {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Pay per Hour of the Part Time Employee");
        double s1=scan.nextDouble();
        System.out.println("Enter the pay per Hour of the Full Time Employee");
        double s2=scan.nextDouble();
        Employee e1=new PartTimeEmployee("Ali",3012,12,"Part Time");
        Employee e2=new FullTimeEmployee("Jameel",3061,24,"Full Time");
        e1.calculateSalary(s1);
        e2.calculateSalary(s2);
    }
}