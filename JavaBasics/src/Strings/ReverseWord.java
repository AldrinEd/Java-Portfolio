package Strings;

import java.util.Scanner;

public class ReverseWord {

    static void reverseWord(Scanner sc){

        System.out.print("Enter a Word: ");
        String word = sc.nextLine();

        String wordReverse = "";

        for(int i = word.length() - 1; i >= 0; i--){

            //get the char at the end of the word, then store in char ch variable
            char ch = word.charAt(i);

            //convert the char to string and store in String ch1 variable
            String ch1 = Character.toString(ch);
            
            //compile the strings using concat - meaning you add the strings.
            wordReverse = wordReverse.concat(ch1);
        }

        System.out.println("The word: " + word);
        System.out.println("The reverse word: " + wordReverse);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        reverseWord(sc);

    }
}
