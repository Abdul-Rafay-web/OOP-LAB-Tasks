package Q6;

public class Vehicle {
    private int model;
    private String brand;
    Vehicle(int model,String brand){
        this.brand=brand;
        this.model=model;
    }
    public void displayDetails(){
        System.out.println("Vehicle Model: "+this.model);
        System.out.println("Vehicle Brand: "+this.brand);
    }
}