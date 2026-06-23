package Projects.BankAccount;

import java.util.Scanner;

public class Login {

    public void login() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter account holder's name: ");
            String inputName = scanner.nextLine().toUpperCase().trim();
            System.out.print("Enter password: ");
            char[] inputPassword = scanner.nextLine().toCharArray();
                
                if (accountChecker(inputName, inputPassword)) {
                    Bank.clearScreen();
                    System.out.println("Login successful. Welcome, " + inputName + "!");
                    break;
                } else {
                    Bank.clearScreen();
                    System.out.println("Login failed. Please try again.");
                }

                java.util.Arrays.fill(inputPassword, ' '); // Clear the password array for security
        }
    }

    public boolean accountChecker(String inputName, char[] inputPassword) {
        Bank bank = new Bank();
        if (bank.getName().equals(inputName) && java.util.Arrays.equals(bank.getPassword(), inputPassword)) {
            return true;
        } else {
            System.out.println("Account information does not match our records. Please try again.");
            return false;
        }
    }
}
