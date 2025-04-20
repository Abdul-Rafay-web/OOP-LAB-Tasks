package Q3;

public class PartTimeEmployee extends Employee{
    PartTimeEmployee(String n,int id,int hours,String type){
        super(n,id,hours,type);
    }
    @Override
    public void calculateSalary(double payPerHour){
        super.calculateSalary(payPerHour);
    }
}

