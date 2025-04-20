package Q5;

public class Electronic extends Product {
    private int duration;
    Electronic(int id,String name,String type){
        super(id,name,type);
    }
    public void applyWarranty(int duration){
        this.duration=duration;
    }
    @Override
    public void displayProductDetails(){
        super.displayProductDetails();
        System.out.println("Warranty: "+this.duration);
    }

}