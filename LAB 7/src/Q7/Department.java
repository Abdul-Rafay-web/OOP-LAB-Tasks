package Q7;

public class Department {
    private String location;
    private String departmentName;
    Department(String departmentName,String location){
        this.departmentName=departmentName;
        this.location=location;
    }
    public void displayDetails(){
        System.out.println("Location :"+this.location);
        System.out.println("Department Name:"+this.departmentName);
    }
}
