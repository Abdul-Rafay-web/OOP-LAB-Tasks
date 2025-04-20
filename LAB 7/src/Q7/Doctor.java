package Q7;

public class Doctor extends Person{
    private int doctorID;
    private String specialization;
    Department department;
    Doctor(String name,int age,int id,String specialization,Department department){
        super(name,age);
        this.doctorID=id;
        this.specialization=specialization;
        this.department=department;
    }
    @Override
    public void displayDetails(){
        System.out.println("Doctor Details: ");
        super.displayDetails();
        System.out.println("Doctor ID: "+this.doctorID);
        System.out.println("Specialization: "+this.specialization);
        System.out.println("Department Details ");
        department.displayDetails();
    }
}
