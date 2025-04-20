package Q4;

import java.util.Scanner;

public class DeliveryManagementSystem {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the ID of the Delivery 1");
        int id1=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the ID of the Delivery 2");
        int id2=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter the name of Delivery 1 Customer");
        String cn1=scan.nextLine();
        System.out.println("Enter the name of Delivery 2 Customer");
        String cn2=scan.nextLine();
        Delivery d1=new ExpressDelivery(id1,cn1,"Express Delivery");
        Delivery d2=new StandardDelivery(id2,cn2,"Standard Delivery");
        if(d1 instanceof  ExpressDelivery){
            d1.displayDetails();
        }
        if(d2 instanceof  StandardDelivery){
            d2.displayDetails();
        }
    }
}