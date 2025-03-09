package Q5;

public class Employee {
    private String employeeName;
    private int employeeId;
    private double salary;
    private String department;
    public Employee(String employeeName, int employeeId, double salary, String department) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
        this.department = department;
    }
    public String getEmployeeDept() {
        return department;
    }
    public double getSalary(){
        return this.salary;
    }
    public void displayEmployee() {
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Salary: " + salary);
        System.out.println("Employee Department: " + department);
    }
}
