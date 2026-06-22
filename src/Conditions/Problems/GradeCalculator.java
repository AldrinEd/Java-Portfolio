package Conditions.Problems;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter your grade: ");
       int grade = sc.nextInt();

       if(grade >= 95){
        System.out.println("Your grade is A!");
       } else if(grade >= 85){
        System.out.println("Your grade is B!");
       } else if(grade >= 75){
        System.out.println("Your grade is C!");
       } else{
        System.out.println("You failed!");
       }
    }
}
