package Loops;

public class DoWhile {

    //PRINT THE SUM OF 1 TO 10
    public static void main(String[] args) {
        
        System.out.println("Sum of 1 - 10");

        int sum = 0;
        int i = 0;
        do{
            sum = sum +  i;
            i++;
        }while(i <= 10);

        System.out.println("The sum of 1 to 10 is: " + sum);
    }
}
