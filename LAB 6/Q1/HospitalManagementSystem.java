package Q1;

import Q2.MedicalReport;
import Q2.Patient;

import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Patient Name: ");
        String patientName=scan.nextLine();
        System.out.println("Enter the Patient Age: ");
        int patientAge=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Doctors Notes");
        String doctorNotes=scan.nextLine();
        System.out.println("Enter the Doctor's prescription");
        String doctorPrescription=scan.nextLine();
        System.out.println("Past Illness History?(True or False)");
        boolean pastIllness=scan.nextBoolean();
        System.out.println("Test Result: (True or False)");
        boolean testResult=scan.nextBoolean();
        Patient patient=new Patient(patientName,patientAge,doctorNotes,doctorPrescription,testResult,pastIllness);
        patient.displayPatientDetails();
    }
}
