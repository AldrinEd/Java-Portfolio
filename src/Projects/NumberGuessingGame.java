package Projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void guessingNumberGame() {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int attempt = 10;
        System.out.println("You have "+ attempt +" attempt to guess.");

        int randomNumber = rand.nextInt(1, 101);

        while(attempt> 0){
        System.out.print("Enter a number: ");
        int guess = sc.nextInt();

            if(guess == randomNumber){
                System.out.println("");
                System.out.println("You win!");
                return;
            }
            else if (guess < randomNumber){
                System.out.println("Too Low!");
                attempt--;
            }
            else if(guess > randomNumber){
                System.out.println("Too High!");
                attempt--;
            }
        }
        if(attempt == 0){
            System.out.println("");
            System.out.println("Game Over!");
            System.out.println("The correct number is: " + randomNumber);
        }
        sc.close();
    }

    public static void main(String[] args) {
        guessingNumberGame();
    }
}
