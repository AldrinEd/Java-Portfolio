package Conditions.Problems;

import java.util.Scanner;

public class LargestOf3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largestNum = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println("The largest number: " + largestNum);

        // Breakdown of the Logic:

        // Outer Ternary: if (a > b) go to a > c, if not go to b > c.
        // Inner Ternary (if a > b): if (a > c), return a, else return c. 
        // Else (if a <= b): if (b > c), return b, else return c.
    }
}
