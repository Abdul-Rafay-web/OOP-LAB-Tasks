package Q8;

public class SavingsAccount extends Account{
    SavingsAccount(int accountNumber){
        super(accountNumber);
    }
    @Override
    public void displayAccountDetails(){
        super.displayAccountDetails();
        System.out.println("This is aSavings Account");
    }
}
