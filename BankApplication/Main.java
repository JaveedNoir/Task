package BankApplication;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new  Bank();
        FileManager fileManager = new  FileManager();
        Account account;
        double defaultBalance = 0;
        Random random = new Random();
        int accountId = 10000 + random.nextInt(90000);

        Scanner input = new Scanner(System.in);

        Account account1 =new CurrentAccount(accountId,"Cavid G",0);
        bank.addAccount(account1);

        for (int i = 0; i < bank.accounts.length; i++) {
            System.out.println(bank.accounts[i]);

        }

        /*System.out.println("Menu:");
        System.out.println("1. Yeni hesab ac");
        System.out.println("2. Pul yatir");
        System.out.println("3. Pul cixart");
        System.out.println("4. Hesablari goster");
        System.out.println("5. Hesablari Fayla yaz/Fayldan oxu");
        System.out.println("6. Pul emeliyyatlarini Fayla yaz/Fayldan oxu");
        System.out.println("7. Exit");
        int choice = input.nextInt();
        input.nextLine();
        switch (choice) {
            case 1:
                System.out.println("Adiniz ve soyadiniz: ");
                String name = input.nextLine();
                System.out.println("Hansi hesabi acmaq isteyirsiniz? \n 1. Deposit \n 2. Normal hesab");
                int choiceAcc = input.nextInt();
                input.nextLine();
                if (choiceAcc == 1) {
                    System.out.println("Ne qeder depozit edeceksiniz?");
                    double amountDep = input.nextDouble();
                    account = new SavingsAccount(accountId, name, amountDep, 5);
                    bank.addAccount(account);
                    System.out.println("Depozit hesabiniz yaradildi!\n Hesab nomreniz:" + account.getAccountNumber());
                } else if (choiceAcc == 2) {
                    account = new CurrentAccount(accountId, name, defaultBalance);
                    bank.addAccount(account);
                    System.out.println("Hesabiniz yaradildi!'\n Hesab nomreniz: " + account.getAccountNumber());
                }
                break;

            case 2:
                boolean isFound = true;
                while (isFound) {
                    System.out.println("Ne qeder depozit edeceksiniz?");
                    double amountDep = input.nextDouble();
                    input.nextLine();
                    System.out.println("Zehmet olmasa hesab nomrenizi qeyd edin: ");
                    int accountNumber = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < bank.accounts.length; i++) {
                        if (bank.accounts[i].getAccountNumber() == accountNumber) {
                            bank.accounts[i].deposit(amountDep);
                            System.out.println(amountDep + " Hesabiniza deposit elave edildi!");
                            isFound = true;
                            break;
                        } else {
                            System.out.println("Bele bir hesab yoxdur!");
                            isFound = false;
                        }
                    }
                }
            case 3:
                boolean isFound2 = true;
                while (isFound2) {
                    System.out.println("Ne qeder pul cixarisi edeceksiniz?");
                    double amountDep = input.nextDouble();
                    input.nextLine();
                    System.out.println("Zehmet olmasa hesab nomrenizi qeyd edin: ");
                    int accountNumber = input.nextInt();
                    input.nextLine();
                    for (int i = 0; i < bank.accounts.length; i++) {
                        if (bank.accounts[i].getAccountNumber() == accountNumber) {
                            bank.accounts[i].withdraw(amountDep);
                            System.out.println(amountDep + " Hesabinizda cixaris edildi!");
                            isFound2 = true;
                            break;
                        } else {
                            System.out.println("Bele bir hesab yoxdur!");
                            isFound2 = false;
                        }
                    }
                }

            case 4:
                bank.printAllAccounts();
                break;

            case 5:
                System.out.println("Hesablari yaddasda saxlamaq isteyirsiniz?\n 1. Export\n2. Import");
                int chooice = input.nextInt();
                if (chooice == 1) {
                    fileManager.saveAccount(bank.accounts);
                    break;
                }else if (chooice == 2) {
                    for (int i = 0; i < fileManager.loadAccountFromFile().length; i++) {
                        System.out.println(fileManager.loadAccountFromFile()[i]);
                    }
                    break;
                }
            case 6:
                System.out.println("Transiaction'lari yaddasda saxlamaq isteyirsiniz?\n 1. Export\n2. Import");
                int chooice2 = input.nextInt();
                if (chooice2 == 1) {
                fileManager.saveTransactionsToFile(bank.transactions);
                break;
                }else if (chooice2 == 2) {
                    for (int i = 0; i < fileManager.loadTransactionsFromFile().length; i++) {
                        System.out.println(fileManager.loadTransactionsFromFile()[i]);
                    }
                    break;
                }
            case 7:
                break;

        }*/
    }
}

