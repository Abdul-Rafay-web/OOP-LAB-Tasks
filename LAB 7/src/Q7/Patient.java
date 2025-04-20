package Q7;

public class Patient extends Person{
    private int patientID;
    private String disease;
    Doctor doctor;
    Patient(String name,int age,int patientID,String disease,Doctor doctor){
        super(name,age);
        this.disease=disease;
        this.patientID=patientID;
        this.doctor=doctor;
    }
    @Override
    public void displayDetails(){
        System.out.println("Patient Details");
        super.displayDetails();
        System.out.println("Patient ID: "+this.patientID);
        System.out.println("Disease "+this.disease);
        doctor.displayDetails();
    }
}
