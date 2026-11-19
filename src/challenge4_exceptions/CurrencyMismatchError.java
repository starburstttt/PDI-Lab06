package challenge4_exceptions;

public class CurrencyMismatchError extends BankError {
    public CurrencyMismatchError(String message) {
        super(message);
    }
}
