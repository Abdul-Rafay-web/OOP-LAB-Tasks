package Q3;

public class FullTimeEmployee extends Employee{
    FullTimeEmployee(String n,int id,int hours,String type){
        super(n,id,hours,type);
    }
    @Override
    public void calculateSalary(double payPerHour){
        super.calculateSalary(payPerHour);
    }
}