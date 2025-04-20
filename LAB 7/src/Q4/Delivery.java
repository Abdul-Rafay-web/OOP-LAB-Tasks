package Q4;

public class Delivery {
    int deliveryId;
    String customerName;
    Delivery(int deliveryId,String customerName){
        this.deliveryId=deliveryId;
        this.customerName=customerName;
    }
    public void displayDetails(){
        System.out.println("The Delivery Type is :");
    }
}