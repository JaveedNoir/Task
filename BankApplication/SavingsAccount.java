package BankApplication;

public class SavingsAccount extends Account{
   private double interretRate;

    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interretRate) {
        super(accountNumber, accountHolder, balance);
        this.interretRate = interretRate;
    }

    public double getInterretRate() {
        return interretRate;
    }

    public void setInterretRate(double interretRate) {
        this.interretRate = interretRate;
    }

    @Override
    void withdraw(double amount) {
        try {
            if (getBalance() > amount) {
                throw new InsufficientBalanceException();
            }else {
                setBalance(getBalance() - amount);
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
        return "SavingsAccount{" +
                "accountNumber=" + getAccountNumber() +
                ", accountHolder='" + getAccountHolder() + '\'' +
                ", balance=" + getBalance() +
                "interretRate=" + getInterretRate() +
                '}';
    }
}
