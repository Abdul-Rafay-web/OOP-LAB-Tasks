package Q7;

public class CloudSoftware extends LicensedSoftware {
    private int storageLimit;
    private double remainingStorage;
    public CloudSoftware(String name,double version,String licenseKey,int expiryYear,int expiryMonth,int storageLimit) {
        super(name,version,licenseKey,expiryYear,expiryMonth);
        this.storageLimit = storageLimit;
    }
    public void checkRemainingStorage(int usedStorage) {
        int remaining= storageLimit - usedStorage;
        this.remainingStorage = remaining;
    }
    public void displayCloudSoftware() {
        super.displayLicenseDetails();
        System.out.println("Remaining Storage " + this.remainingStorage+"%");
    }
}
