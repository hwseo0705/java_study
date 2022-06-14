package day15.exception;

// User Defined Exception Class
public class BalanceInsufficientException extends Exception {

    public BalanceInsufficientException() {
    }

    public BalanceInsufficientException(String message) {
        super(message);
    }
}
