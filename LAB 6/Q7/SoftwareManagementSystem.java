package Q7;

import java.util.Scanner;

public class SoftwareManagementSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Software Name: :");
        String name = scan.nextLine();
        System.out.println("Enter license key: ");
        String licenseKey = scan.nextLine();
        System.out.println("Enter Version: ");
        double version = scan.nextDouble();
        scan.nextLine();
        Software software1=new Software(name,version,licenseKey);
        software1.displaySoftwareDetails();
        System.out.println("Enter Expiry Year: ");
        int expiryYear = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Expiry Month: ");
        int expiryMonth = scan.nextInt();
        scan.nextLine();
        LicensedSoftware ls1=new LicensedSoftware(name,version,licenseKey,expiryYear,expiryMonth);
        ls1.checkLicenseValidity(expiryYear,expiryMonth);
        ls1.displayLicenseDetails();
        System.out.println("Enter Storage Limit: ");
        int storageLimit = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Used Storage: ");
        int usedStorage = scan.nextInt();
        scan.nextLine();
        CloudSoftware cloudSoftware1=new CloudSoftware(name,version,licenseKey,expiryYear,expiryMonth,storageLimit);
        cloudSoftware1.checkRemainingStorage(usedStorage);
        cloudSoftware1.displayCloudSoftware();
    }
}
