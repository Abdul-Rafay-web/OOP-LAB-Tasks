package Q8;

public class AccountManagementSystem {
    public static void main(String[] args){
        Account account=new Account(02122121);
        account.displayAccountDetails();
        account.calculateInterest(500000);
        SecureTransaction sr1=new SecureTransaction();
        sr1.processTransaction();
    }
}
