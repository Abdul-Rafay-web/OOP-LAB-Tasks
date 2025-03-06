package Q5;

public class Customer {
    private String customerName;
    private int customerID;
    private String contactNumber;
    private int duration;
    private Car car;
    public Customer(String customerName, int customerID, String contactNumber, int time) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.contactNumber = contactNumber;
        this.duration = time;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void rentACar(Car car){
        this.car = car;
    }
    public void displayCustomer(){
        System.out.println("Customer: " + customerName);
        System.out.println("License: " + customerID);
        System.out.println("Contact: " + contactNumber);
        System.out.println("Time: " + duration);
        System.out.println("Car: " + car.getCarModel());
    }

}
