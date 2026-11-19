package challenge4_exceptions;

public class AccountNotFoundError extends BankError {
    public AccountNotFoundError(String message) {
        super(message);
    }
}
