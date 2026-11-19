package challenge4_exceptions;

public class BankError extends Exception {
    public BankError(String message) {
        super(message);
    }
}
