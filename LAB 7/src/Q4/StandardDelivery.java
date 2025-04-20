package Q4;

public class StandardDelivery extends Delivery {
    String type;
    StandardDelivery(int id,String cN,String type){
        super(id,cN);
        this.type=type;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(this.type);
    }
}
