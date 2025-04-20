package Q8;

public class Account {
    private final int accountNumber;
    Account(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public void displayAccountDetails(){
        System.out.println("Account # :"+this.accountNumber);
    }
    public final void calculateInterest(int amount){
        System.out.println("Interest Amount: "+(amount*0.05));
    }
}
