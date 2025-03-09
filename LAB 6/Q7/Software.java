package Q7;

public class Software {
    private String softwareName;
    private double version;
    private String licenseKey;
    public Software(String softwareName, double version, String licenseKey) {
        this.softwareName = softwareName;
        this.version = version;
        this.licenseKey = licenseKey;
    }
    public void displaySoftwareDetails() {
        System.out.println("Software Name: " + softwareName);
        System.out.println("Version: " + version);
        System.out.println("License Key: " + licenseKey);
    }
}
