package Q1;

import java.util.Scanner;

public class OrderMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the category: ");
        String categoryName = sc.nextLine();
        System.out.println("Enter the description of the category: ");
        String categoryDescription = sc.nextLine();
        Category c1 = new Category(categoryName,categoryDescription);
        System.out.println("Enter the id of the product: ");
        int productId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the Product: ");
        String productName = sc.nextLine();
        System.out.println("Enter the quantity of the product: ");
        int productQuantity = sc.nextInt();
        System.out.println("Enter the price of the product: ");
        double productPrice = sc.nextDouble();
        Product p1=new Product(productId,productName,productPrice,productQuantity,c1);
        System.out.println("Enter the ID of the Order");
        int orderId = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the Order: ");
        String orderName = sc.nextLine();
        System.out.println("Enter the Address of the Customer");
        String address = sc.nextLine();
        Order o1=new Order(orderId,orderName,address);
        o1.addProduct(p1);
        o1.displayOrderDetails();
    }
}