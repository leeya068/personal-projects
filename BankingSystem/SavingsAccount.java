package BankingSystem;

public class SavingsAccount extends Account {
    private double interestRate = 0.03;

    public SavingsAccount(String accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if(amount > getBalance()){
            System.out.println("Insufficient funds for withdrawal.");
        } else{
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from Savings Account.");
        }
    }

    @Override
    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        balance += interest;

        System.out.println("Interest of $" + interest + " added to account.");
    }
}