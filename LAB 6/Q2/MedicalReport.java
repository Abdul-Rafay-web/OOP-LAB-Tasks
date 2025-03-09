package Q2;

public class MedicalReport {
    private String doctorNotes;
    private String prescription;
    private boolean testResult;
    private boolean pastIllness;
    public MedicalReport(String doctorNotes, String prescription, boolean testResult, boolean pastIllness) {
        this.doctorNotes = doctorNotes;
        this.prescription = prescription;
        this.testResult = testResult;
        this.pastIllness = pastIllness;
    }
    public void displayMedicalReport(){
        System.out.println("Doctor Notes: "+doctorNotes);
        System.out.println("Prescription: "+prescription);
        System.out.println("Test Result: "+testResult);
        System.out.println("Past Illness: "+pastIllness);
    }
}
