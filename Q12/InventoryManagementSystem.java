package Q12;

import java.util.Scanner;

public class InventoryManagementSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the product name: ");
        String name=scan.nextLine();
        System.out.println("Enter the product ID");
        int id=scan.nextInt();
        System.out.println("Enter the product quantity: ");
        int quantity=scan.nextInt();
        System.out.println("Enter the product price: ");
        double price=scan.nextDouble();
        scan.nextLine();
        Product p1=new Product(name,id,price,quantity);
        Product p2=new Product("Milk Pack",334,75,10);
        Product p3=new Product("Cheese",456,80,17);
        Product p4=new Product("Chips",456,80,20);
        Inventory inventory=new Inventory("Local Inventory");
        inventory.addProduct(p1);
        inventory.addProduct(p2);
        inventory.addProduct(p3);
        inventory.addProduct(p4);
        inventory.displayInventory();
        System.out.println("Enter the product ID to delete");
        int removeId=scan.nextInt();
        scan.nextLine();
        inventory.removeProduct(removeId);
        System.out.println("Enter the product ID to update Stock");
        int updateId=scan.nextInt();
        System.out.println("How much to add stock?");
        int addId=scan.nextInt();
        scan.nextLine();
        inventory.updateStock(updateId,addId);
        inventory.displayInventory();
    }
}
