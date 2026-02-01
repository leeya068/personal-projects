package BankingSystem;

public class CurrentAccount extends Account {
    private double overdraftLimit =  -500.0;

    public CurrentAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if(getBalance() - amount < overdraftLimit){
            System.out.println("Withdrawal exceeds overdraft limit.");
        } else{
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Current Account.");
        }
    }

    @Override
    public void calculateInterest() {
        System.out.println("Current Accounts do not earn interest.");
    }
}
