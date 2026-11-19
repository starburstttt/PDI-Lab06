package ex7_payment;

public class Main {
    public static void main(String[] args) {
        Payment[] payments = {
            new CreditCardPayment(),
            new PayPalPayment(),
            new BankTransferPayment()
        };

        for (Payment p : payments) {
            p.processPayment(150.00);
        }
    }
}
