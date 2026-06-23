package Projects.BankAccount;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        while (true) {
            System.out.print("Enter account holder's name: ");
            String inputName = scanner.nextLine();
            System.out.print("Enter account number: ");
            int inputAccountNumber = scanner.nextInt();
            scanner.nextLine();

            if (bank.accountChecker(inputName, inputAccountNumber)) {
                break;
            }
        }

        while (true) {

            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Info");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    bank.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    bank.withdraw(withdrawalAmount);
                    break;
                case 3:
                    bank.displayAccountInfo();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

    }
}
