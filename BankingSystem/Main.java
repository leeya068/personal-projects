package BankingSystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Banking System");

        Account acc1 = new SavingsAccount("SA001", "John Doe", 1000.0);
        Account acc2 = new CurrentAccount("CA001", "Jane Smith", 500.0);

        acc1.deposit(200.0);
        acc1.withdraw(150.0);
        acc1.calculateInterest();
        acc1.displayAccountInfo();  

        acc2.deposit(300.0);
        acc2.withdraw(900.0);
        acc2.calculateInterest();
        acc2.displayAccountInfo();

    }
}