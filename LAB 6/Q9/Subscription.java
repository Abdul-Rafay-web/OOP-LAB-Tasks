package Q9;

import java.util.ArrayList;

public class Subscription {
    private static int subscriptionsCounter = 0;
    private int subscriptionID;
    private String customerName;
    private String planType;
    private final double price;
    private ArrayList<Subscription> subscribers;
    public Subscription(int subscriptionID, String customerName, String planType, double price) {
        this.subscriptionID = subscriptionID;
        this.customerName = customerName;
        this.planType = planType;
        this.price = price;
        this.subscribers = new ArrayList<Subscription>();
        subscriptionsCounter++;
        subscribers.add(this);
    }
    public String getCustomerName() {
        return customerName;
    }
    public static void displayTotalSubscriptions() {
        System.out.println("Total Subscriptions : " + subscriptionsCounter);
    }
    public void cancelSubscription(int subscriptionID) {
        int found=0;
        for (Subscription subscription : subscribers) {
            if (subscription.subscriptionID == subscriptionID) {
                found=1;
                this.subscriptionsCounter--;
                System.out.println("Cancelling Subscription for " + subscription.getCustomerName());
            break;
            }
        }
        if(found==0){
            System.out.println("Subscriber not found");
        }
    }
}
