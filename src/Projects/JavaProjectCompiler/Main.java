package Projects.JavaProjectCompiler;

import java.util.Scanner;

import ArraysFolder.TwoSum;
import Conditions.Problems.EvenOrOdd;
import Conditions.Problems.GradeCalculator;
import Conditions.Problems.PositiveOrNegative;
import Loops.Problems.MultiplicationTable;
import Projects.AreaOfShapes;
import Projects.Calculator;
import Projects.NumberGuessingGame;
import Projects.PrimeNumberChecker;
import Projects.TicTacToe;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isDone = false;

        while(!isDone){
            System.out.println("My Java Projects\n");
            System.out.println("Menu: \n");
            System.out.println("1. Calculator");
            System.out.println("2. Tic Tac Toe");
            System.out.println("3. Number Guessing Game");
            System.out.println("4. Prime Number Checker");
            System.out.println("5. Calculate Areas");
            System.out.println("6. Multiplication Table ");
            System.out.println("7. Even or Odd");
            System.out.println("8. Positive or Negative");
            System.out.println("9. Grade Calculator");
            System.out.println("10. Two Sum");
            displayChoice(sc);
            isDone = confirmation(isDone, sc);
        }
        sc.close();
    }

    public static void displayChoice(Scanner sc){
        System.out.print("Enter a number: ");
        int choice = sc.nextInt();
        System.out.println();
        

        while(choice < 1 || choice > 10){
            System.out.print("Enter an integer between 1 and 10: ");
            
            if(sc.hasNextInt()){
                choice = sc.nextInt();
                if (choice < 1 || choice > 100) {
                    System.out.println("Error: Number must be between 1 and 100.");
                }
            } else {
                // Consume invalid input to prevent infinite loop
                String invalid = sc.next();
                System.out.println("Error: '" + invalid + "' is not a valid integer.");
            }
            
        }

        switch (choice) {
            case 1:{
                Calculator.main(null);
                break;
            }

            case 2:{
                TicTacToe.main(null);
                break;
            }

            case 3:{
                NumberGuessingGame.main(null);
                break;
            }

            case 4:{
                PrimeNumberChecker.main(null);
                break;
            }

            case 5:{
                AreaOfShapes.main(null);
                break;
            }

            case 6:{
                MultiplicationTable.main(null);
                break;
            }

            case 7:{
                EvenOrOdd.main(null);
                break;
            }

            case 8:{
                PositiveOrNegative.main(null);
                break;
            }

            case 9:{
                GradeCalculator.main(null);
                break;
            }

            case 10:{
                TwoSum.main(null);
                break;
            }

            default:
                System.out.println("Invalid Input. Closing app...");
                break;
        }
    }

    public static boolean confirmation(boolean isDone, Scanner sc){  
        sc.nextLine();  
        char choice = ' ';
        boolean invalidInput = true;

        while(invalidInput){
            
            System.out.print("Do you want to continue? (y/n): ");
            String input = sc.nextLine();
            
            if(input.length() > 0){
                choice = Character.toLowerCase(input.charAt(0));

                if (choice == 'y' || choice == 'n') {
                    invalidInput = false;
                } else {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }

            } else {
                System.out.println("Input cannot be empty.");
            }
            
                if(choice == 'y'){
                    isDone = false;
                    invalidInput = false;
                }
                else if(choice == 'n'){
                    System.out.println("Thank you. Bye!");
                    isDone = true;
                    invalidInput = false;
                }
            }

        return isDone;
    }
}
