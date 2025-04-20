package Q6;

public class Car extends Vehicle{
    private int noOfSeats;
    Car(int model,String brand,int noOfSeats){
        super(model,brand);
        this.noOfSeats=noOfSeats;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Number of Seats of Car "+this.noOfSeats);
    }
}
