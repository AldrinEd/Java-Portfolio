package OOP.Encapsulation.BankAccount;

public class Bank {
    private String name = "ALDRIN";
    private char[] password = "password123".toCharArray();
    private int accountNumber = 123456;
    private double balance = 1000.0;

    public String getName() {
        return name;
    }

    public char[] getPassword() {
        return password;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            clearScreen();
            System.out.println("Deposited: " + amount);
            displayAccountInfo();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            clearScreen();
            System.out.println("Withdrew: " + amount);
            displayAccountInfo();
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    public static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
