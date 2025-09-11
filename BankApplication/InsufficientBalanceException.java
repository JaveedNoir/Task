package BankApplication;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException() {
      super("Insufficient balance for withdrawal");
    }


}
