package Q5;

import java.util.ArrayList;
public class Rental {
     private ArrayList<Car>cars;
    private ArrayList<Customer>customers;
    public Rental(){
        this.cars = new ArrayList<>();
        this.customers = new ArrayList<>();
    }
    public void addCar(Car car){
        cars.add(car);
    }
    public void availableCars(){
        System.out.println("Available Cars: ");
        for (Car car : cars) {
            car.displayCarDetails();
        }
    }
    public void rent(Customer customer,int plate){
        int found=0;
        for (Car car : cars) {
            if (car.getCarPlate() == plate) {
                found=1;
                customers.add(customer);
                System.out.println("Car "+car.getCarModel()+" has been rented");
                break;
            }
        }
        if (found==0) {
            System.out.println("Car Not Found");
        }
    }
    public void displayRentDetails(){
        for (Car car : cars) {
            car.displayCarDetails();
        }
    }
}
