package Operators;

public class UnaryOperators{

    //Unary Operators need only one operand. They are used to increment, decrement, or negate a value. 
    
    // Explanation:

    // Unary operators work on a single operand (a and b).
    // Post-increment (a++) returns the value first, then increments it.
    // Pre-increment (++a) increments first, then returns the updated value.
    // Same behavior applies to decrement operators (--).

     public static void main(String[] args){
        
        // Integer declared
        int a = 10;
        int b = 10;

        // Using unary operators
        System.out.println("Postincrement : " + (a++));
        System.out.println("Preincrement : " + (++a));

        System.out.println("Postdecrement : " + (b--));
        System.out.println("Predecrement : " + (--b));
    }
}