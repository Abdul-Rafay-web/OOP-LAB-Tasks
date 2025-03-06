package Q5;

import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the Customer");
        String name = scan.nextLine();
        System.out.println("Enter the ID of the Customer");
        int customerID = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Contact Number");
        String contactNumber = scan.nextLine();
        System.out.println("Enter the Time Duration(in hours)");
        int duration = scan.nextInt();
        scan.nextLine();
        Customer customer1 = new Customer(name, customerID, contactNumber, duration);
        System.out.println("Enter the Car Model");
        String carModel = scan.nextLine();
        System.out.println("Enter the Car Plate");
        int carPlate = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the Category");
        String category = scan.nextLine();
        Category category1=new Category(category);
        Category category2=new Category("Sedan");
        Category category3=new Category("SUV");
        Car car1=new Car(carModel,carPlate,category1);
        Car car2=new Car("Toyota Grande",12355,category2);
        Car car3=new Car("HiJet",12454,category3);
        Rental r=new Rental();
        r.addCar(car1);
        r.addCar(car2);
        r.addCar(car3);
        r.availableCars();
        System.out.println("Enter the Plate of the Number of the Car to Rent");
        int plate = scan.nextInt();
        scan.nextLine();
        r.rent(customer1,plate);
    }
}
