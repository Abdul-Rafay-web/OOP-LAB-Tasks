package Q5;

public class Product {
    private int id;
    private String name;
    private String type;
    Product(int id,String name,String type){
        this.id=id;
        this.name=name;
        this.type=type;
    }
    public void displayProductDetails(){
        System.out.println("Product name: "+this.name);
        System.out.println("Product ID: "+this.id);
    }
}