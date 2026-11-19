package ex4_bank;

public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void displaySummary() {
        System.out.println("Account: " + accountNumber + " | Balance: $" + balance + " | Interest Rate: " + interestRate + "%");
    }
}
