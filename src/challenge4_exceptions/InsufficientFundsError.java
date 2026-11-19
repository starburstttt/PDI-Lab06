package challenge4_exceptions;

public class InsufficientFundsError extends BankError {
    public InsufficientFundsError(String message) {
        super(message);
    }
}
