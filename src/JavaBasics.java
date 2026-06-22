public class JavaBasics {
    public static void main(String[] args) {
        
        // #1 Print Function
        System.out.println("Java Basics");

        // #2 Data Types
        String name = "Aldrin";
        // boolean isStudent = true;
        // double height = 5.5;

        System.out.println("By: " + name);
         int a = 10, b = 3;
        
        // Addition
        int sum = a + b;
        
        // Subtraction
        int diff = a - b;
        
        // Multiplication
        int mul = a * b;
        
        // Division
        int div = a / b;
        
        // Modulus
        int mod = a % b;      // Modulus

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Multiplication: " + mul);
        System.out.println("Division: " + div);
        System.out.println("Modulus: " + mod);
        System.out.println("Power: " + Math.pow(a,b));      // Power: 100000.0  - this is exponent

    }
}
