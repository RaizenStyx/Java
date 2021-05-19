/**
 * Message for when exception is thrown.
 */


package cs2.labs.lab06;

public class InsufficientFundsException extends Exception {
    final private String message = "Insufficient Funds Exception";

    public InsufficientFundsException() {
        super();
    }

    public String getMessage() {
        return this.message;
    }
}
