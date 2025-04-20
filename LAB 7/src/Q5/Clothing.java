package Q5;

public class Clothing extends Product {
    int discountPercentage;
    Clothing(int id,String name,String type){
        super(id,name,type);
    }
    public void applyDiscount(int discount){
        this.discountPercentage=discount;
    }
    @Override
    public void displayProductDetails(){
        super.displayProductDetails();
        System.out.println("Discount: "+this.discountPercentage);
    }

}
