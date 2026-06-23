package Projects.BankAccount;

public class Bank {
    private String name = "Aldrin";
    private int accountNumber = 123456;
    private double balance = 1000.0;

    public String getName() {
        return name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }

    public boolean accountChecker(String inputName, int inputAccountNumber) {
        if (name.equals(inputName) && accountNumber == inputAccountNumber) {
            System.out.println("Account verified successfully.");
            return true;
        } else {
            System.out.println("Account verification failed.");
            return false;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}
