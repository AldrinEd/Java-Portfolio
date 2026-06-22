package Projects;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Prime Number Checker.");
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        primeChecker(num);
    }

    //Prime or Composite?
    public static boolean primeChecker(int num){
        boolean prime = false;
        int count = 0;

        if(num == 1){
            System.out.println("The number 1 is neither prime nor composite because it has only one divisor");
            return prime;
        }
        for(int i = 1; i  <= num; i++){
            if (num % i == 0){
                count++;
            }
        }

        if(count == 2){
            prime = true;
            System.out.println("The number is Prime!");
        }
        else{
            System.out.println("The number is Composite!");
        }
        return prime;
    }
}
