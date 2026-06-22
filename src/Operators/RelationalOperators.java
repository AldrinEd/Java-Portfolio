package Operators;

public class RelationalOperators {
    public static void main(String[] args) {

        // Relational Operators are used to check for relations like equality, greater than, and less than. 
        // They return boolean results after the comparison and are extensively used in looping statements 
        // as well as conditional if-else statements.  


        // Comparison operators
        int a = 10;
        int b = 3;
        int c = 5;

        System.out.println("a > b: " + (a > b));        //true
        System.out.println("a < b: " + (a < b));        //false
        System.out.println("a >= b: " + (a >= b));      //true
        System.out.println("a <= b: " + (a <= b));      //false
        System.out.println("a == c: " + (a == c));      //false
        System.out.println("a != c: " + (a != c));      //true
    }
}
