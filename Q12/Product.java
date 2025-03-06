package Q12;

public class Product {
    private String name;
    private int productID;
    private double price;
    private int quantity;
    public Product(String name, int productID, double price, int quantity) {
        this.name = name;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    public int getProductID() {
        return productID;
    }
    public String getName() {
        return name;
    }
    public void setProductQuantity(int quantity) {
        this.quantity +=quantity;
        System.out.println("Quantity of the product has been added");
    }
    public void displayProductInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Product ID: " + this.productID);
        System.out.println("Price: " + this.price);
        System.out.println("Quantity: " + this.quantity);
    }
}
