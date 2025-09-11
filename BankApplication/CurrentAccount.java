package BankApplication;

public class CurrentAccount extends Account{
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
        this.overdraftLimit = 5000;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void setOverdraftLimit(double overdraftLimit) {
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    void withdraw(double amount) {
        try {
            if (getBalance() > amount || getOverdraftLimit()>amount) {
                throw new InsufficientBalanceException();
            }else {
            setBalance(getBalance() - amount);
            setOverdraftLimit(getOverdraftLimit()-amount);
            }
        }catch (InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    void displayAccountInfo() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Account Holder: " + getAccountHolder());
        System.out.println("Balance: " + getBalance());
    }

    @Override
    public String toString() {
        return "CurrentAccount{" +
                "accountNumber=" + getAccountNumber() +
                ", accountHolder='" + getAccountHolder() + '\'' +
                ", balance=" + getBalance() +
                "overdraftLimit=" + getOverdraftLimit() +
                '}';
    }
}
