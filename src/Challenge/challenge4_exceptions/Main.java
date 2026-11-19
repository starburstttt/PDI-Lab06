package challenge4_exceptions;

public class Main {
    public static void withdraw(double balance, double amount) throws InsufficientFundsError {
        if (amount > balance) {
            throw new InsufficientFundsError("Cannot withdraw $" + amount + " from $" + balance);
        }
    }

    public static void main(String[] args) {
        try {
            withdraw(100.0, 250.0);
        } catch (BankError e) {
            System.out.println("Caught BankError (" + e.getClass().getSimpleName() + "): " + e.getMessage());
        }
    }
}
