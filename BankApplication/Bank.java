package BankApplication;

import java.util.Arrays;

public class Bank {
    Account[] accounts;
    Transaction[] transactions;
    private int accountCount;
    private int transactionCount;

    void addAccount(Account account) {
        try {
            if (accounts == null) {
                accounts = new Account[1];
                accounts[0] = account;
                accountCount++;
                System.out.println("Account elave olundu!");
                return;
            }
            Account[] newAccounts = new Account[accountCount + 1];
            for (int i = 0; i < accountCount; i++) {
                newAccounts[i] = accounts[i];
            }
            newAccounts[newAccounts.length - 1] = account;
            accounts = newAccounts;
            System.out.println("Account elave olundu!");
            accountCount++;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    Account findAccount(int accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }

    void performTransaction(int accountNumber, double amount, String type) {
        try {
            for (int i = 0; i < accountCount; i++) {
                if (accounts[i].getAccountNumber() == accountNumber && type.equals("Deposit")) {
                    accounts[i].deposit(amount);
                    System.out.println("Deposited " + amount);
                } else if (accounts[i].getAccountNumber() == accountNumber && type.equals("Withdraw")) {
                    accounts[i].withdraw(amount);
                    System.out.println("Withdrawn " + amount);
                }
            }

            if (transactions == null) {
                transactions = new Transaction[1];
                transactions[0] = new Transaction(transactionCount, type, amount);
                transactionCount++;
                return;
            }
            Transaction[] newTransactions = new Transaction[transactionCount + 1];
            for (int i = 0; i < transactionCount; i++) {
                newTransactions[i] = transactions[i];
            }
            newTransactions[newTransactions.length - 1] = new Transaction(transactionCount, type, amount);
            transactionCount++;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    void printAllAccounts() {
        if (accounts == null || accountCount == 0) {
            System.out.println("Heç bir hesab yoxdur!");
            return;
        }

        for (int i = 0; i < accountCount; i++) {
            if (accounts[i] != null) {
                System.out.println(accounts[i]);
            }
        }
    }


    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + Arrays.toString(accounts) +
                ", accountCount=" + accountCount +
                '}';
    }
}
