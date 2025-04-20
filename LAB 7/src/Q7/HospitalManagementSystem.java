package Q7;

import java.util.Scanner;

public class HospitalManagementSystem {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Name of the Department: ");
        String dName=scan.nextLine();
        System.out.println("Enter the Location of the Department");
        String dLocation=scan.nextLine();
       Department d=new Department(dName,dLocation);
       Doctor doctor=new Doctor("Burhan Tariq",21,2345,"Neuro Surgery",d);
       Patient patient=new Patient("Naeem",21,29,"Brain Tumour",doctor);
       patient.displayDetails();
    }
}
