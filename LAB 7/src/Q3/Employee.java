package Q3;

public class Employee {
    private String name;
    private int employeeID;
    private double salary;
    private int hours;
    private String type;

    Employee(String name, int id, int hours, String type) {
        this.name = name;
        this.employeeID = id;
        this.hours = hours;
        this.type = type;
    }

    public void calculateSalary(double payPerHour) {
        this.salary = this.hours * payPerHour;
        System.out.println("Your Salary is: " + this.salary + " You are " + this.type + " Employee");
    }
}