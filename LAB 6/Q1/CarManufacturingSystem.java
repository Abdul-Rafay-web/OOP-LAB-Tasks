package Q1;

import java.util.Scanner;

public class CarManufacturingSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Brand Name of the Car");
        String brand=scan.nextLine();
        System.out.println("Enter the Model Name of the Car");
        String model=scan.nextLine();
        System.out.println("Enter the Chassis Number of the Car");
        int chassisNumber=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Engine Material of the Car");
        String engineNumber=scan.nextLine();
        Car car = new Car(brand,chassisNumber,model,engineNumber);
        car.displayCarInfo();
    }
}
