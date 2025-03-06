package Q12;

import java.util.ArrayList;

public class Inventory {
    private String inventoryName;
    private ArrayList<Product>products;
    public Inventory(String inventoryName){
        this.inventoryName = inventoryName;
        this.products = new ArrayList<>();
    }
    public void addProduct(Product p){
        this.products.add(p);
    }
    public void removeProduct(int id){
        int found=0;
        for(Product p1: products){
            if(p1.getProductID()==id){
                found++;
                products.remove(p1);
                System.out.println("Product"+p1.getName()+" removed");
                break;
            }
        }
        if(found==0){
            System.out.println("Product not found");
        }
    }
    public void updateStock(int id, int amount){
        int found=0;
        for(Product p1: products){
            if(p1.getProductID()==id){
                found++;
p1.setProductQuantity(amount);
            }
        }
    }
    public void displayInventory(){
        System.out.println("Inventory Name: " + inventoryName);
        for(Product p1: products){
            p1.displayProductInfo();
        }
    }
}
