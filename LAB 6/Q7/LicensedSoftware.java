package Q7;

public class LicensedSoftware extends Software {
    private int expiryYear;
    private int expiryMonth;
    private boolean expired;

    public LicensedSoftware(String softwareName, double version, String licenseKey, int softwareExpiryYear, int softwareExpiryMonth) {
        super(softwareName, version, licenseKey);
        this.expiryYear = softwareExpiryYear;
        this.expiryMonth = softwareExpiryMonth;
    }

    public void checkLicenseValidity(int expiryYear, int expiryMonth) {
        if (this.expiryYear < expiryYear && this.expiryMonth < expiryMonth) {
            this.expired = true;
        } else {
            this.expired = false;
        }
    }
    public void displayLicenseDetails() {
        super.displaySoftwareDetails();
        System.out.println("Licensed Expired: " + this.expired);
    }
}

