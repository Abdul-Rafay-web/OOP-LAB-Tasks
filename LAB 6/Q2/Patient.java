package Q2;

public class Patient {
    private String patientName;
    private int patientAge;
    private MedicalReport medicalReport;
    public Patient(String pName, int pAge,String doctorsNotes,String prescription,boolean testResult,boolean pastIllness) {
        this.patientName=pName;
        this.patientAge=pAge;
        this.medicalReport=new MedicalReport(doctorsNotes, prescription, testResult, pastIllness);
    }
    public void displayPatientDetails() {
        System.out.println("Name: "+patientName);
        System.out.println("Age: "+patientAge);
        this.medicalReport.displayMedicalReport();
    }
}
