package ex7_payment;

public class BankTransferPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Bank Transfer payment of $" + amount);
    }
}
