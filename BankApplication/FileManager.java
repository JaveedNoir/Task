package BankApplication;

import java.io.*;

public class FileManager {
    void saveAccount(Account[] account) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Accounts.txt"))) {
            oos.writeObject(account);
            System.out.println("Account Arrayi export oldu");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    Account[] loadAccountFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Accounts.txt"))) {
            return (Account[]) ois.readObject();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    void saveTransactionsToFile(Transaction[] transaction) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Transactions.txt"))) {
            oos.writeObject(transaction);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    Transaction[] loadTransactionsFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Transactions.txt"))) {
            return (Transaction[]) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
