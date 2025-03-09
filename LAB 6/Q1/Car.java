package Q1;

public class Car {
    private String brand;
    private int chassisNumber;
    private String model;
    private Engine engine;
    public Car(String brand, int chassisNumber, String model,String material) {
        this.brand = brand;
        this.model = model;
        this.chassisNumber = chassisNumber;
        this.engine = new Engine(material);
    }
    public void displayCarInfo(){
        System.out.println("Brand: " + brand);
        System.out.println("Chassis: " + chassisNumber);
        System.out.println("Model: " + model);
        engine.displayEngineInfo();
    }
}
