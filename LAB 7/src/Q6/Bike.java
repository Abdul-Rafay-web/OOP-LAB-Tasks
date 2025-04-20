package Q6;

public class Bike extends Vehicle{
    private int enginePower;
    Bike(int model,String brand,int enginePower){
        super(model,brand);
        this.enginePower=enginePower;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Bike Engine Power: "+this.enginePower);
    }
}