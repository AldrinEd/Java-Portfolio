package Projects;

import java.util.Scanner;

public class Calculator {
    public static int add(int a, int b){
        int sum = a + b;
        System.out.println("Sum: " + sum);
        return (sum);
    }

    public static int subtract(int a, int b){
        int difference = a - b;
        System.out.println("Difference: " + difference);
        return (difference);
    }

    public static int multiply(int a, int b){
        int product = a * b;
        System.out.println("Product: " + product);
        return (product);
    }

     public static int divide(int a, int b){
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);
        return (quotient);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to do?");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Select a number: ");
        int choice = sc.nextInt();
        
        // This is the clear console screen in java (clrscr() in C++)
        // System.out.print("\033[H\033[2J");
        // System.out.flush(); 

        switch (choice) {
            case 1:{
                System.out.println("\nAddition\n");
                System.out.print("Enter 1st number: ");
                int a = sc.nextInt();
                System.out.print("Enter 2nd number: ");
                int b = sc.nextInt();
                add(a, b);
                break;
            }
                
            case 2:{
                System.out.println("\nSubtraction\n");
                System.out.print("Enter 1st number(Minuend): ");
                int a = sc.nextInt();
                System.out.print("Enter 2nd number(Subtrahend): ");
                int b = sc.nextInt();
                subtract(a, b);
                break;
            }
            
            case 3:{
                System.out.println("\nMultiplication\n");
                System.out.print("Enter 1st number(Multiplicand): ");
                int a = sc.nextInt();
                System.out.print("Enter 2nd number(Multiplier): ");
                int b = sc.nextInt();
                Calculator.multiply(a, b);
                break;
            }

            case 4:{
                System.out.println("\nDivision\n");
                System.out.print("Enter 1st number(Dividend): ");
                int a = sc.nextInt();
                System.out.print("Enter 2nd number(Divisor): ");
                int b = sc.nextInt();
                Calculator.divide(a, b);
                break;
            }
        
            default:
                System.out.println("Invalid Input!");
                break;
        }


    }
}


