package Q1;

public class Product {
    int productID;
    String productName;
    double productPrice;
    int productQuantity;
    Category category;
    public Product(int productID, String productName, double productPrice, int productQuantity, Category category) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.category = category;
    }
    public void displayProduct() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
        System.out.println("Product Quantity: " + productQuantity);
        category.displayCategory();
    }
}
