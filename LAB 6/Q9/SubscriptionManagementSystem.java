package Q9;

import java.util.Scanner;

public class SubscriptionManagementSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
            System.out.println("Enter the Subscription ID");
            int subscriptionID = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the Customer Name");
            String customerName = scan.nextLine();
            System.out.println("Enter the Plan Type");
            String planType = scan.nextLine();
            System.out.println("Enter the price for the Plan");
            double price = scan.nextDouble();
            scan.nextLine();
            Subscription sub = new Subscription(subscriptionID, customerName, planType, price);
            Subscription sub2=new Subscription(10219,"Muhammad Omer","Basic",9.99);
        Subscription.displayTotalSubscriptions();
        System.out.println("Enter the Subscription ID to cancel the subscription");
        int cancelID = scan.nextInt();
        scan.nextLine();
        sub.cancelSubscription(cancelID);
        Subscription.displayTotalSubscriptions();
    }
}
