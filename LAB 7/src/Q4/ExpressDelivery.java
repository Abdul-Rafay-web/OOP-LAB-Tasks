package Q4;

public class ExpressDelivery extends Delivery{
    String type;
    ExpressDelivery(int id,String cN,String type){
        super(id,cN);
        this.type=type;
    }
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println(this.type);
    }
}