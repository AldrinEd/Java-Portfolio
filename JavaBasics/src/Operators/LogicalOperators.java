package Operators;

public class LogicalOperators {
    public static void main(String[] args) {
        
        // Logical Operators are used to perform "logical AND" and "logical OR" operations, 
        // similar to AND gate and OR gate in digital electronics. They have a short-circuiting effect, 
        // meaning the second condition is not evaluated if the first is false.
        
        // Logical operators
        boolean x = true;
        boolean y = false;
      
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));
    }
}
