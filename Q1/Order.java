package Q1;

import java.util.ArrayList;

public class Order {
    int orderID;
    String customerName;
    String customerAddress;
    ArrayList<Product> products;
    public Order(int orderID, String customerName, String customerAddress) {
        this.orderID = orderID;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.products = products;
        products=new ArrayList<>();
    }
    public void addProduct(Product product) {
        this.products.add(product);
    }
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Address: " + customerAddress);
        for (Product p: products) {
            p.displayProduct();
        }
    }
}
