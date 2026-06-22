package ArraysFolder.ArrayClass;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        System.out.println("Sorting an Array");

        System.out.println("----Sorting in Ascending Order----");
        int arr[] = {3, 7, 5, 2, 8, 6 };
        Arrays.sort(arr);
        System.out.println("Array: " + Arrays.toString(arr));

        System.out.println("----Sorting in Descending Order----");
        Integer[] numbers = { 3, 7, 5, 2, 8, 6 };
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Array: " + Arrays.toString(numbers));

        System.out.println("----Sorting a Sub-Array----"); // sorting a range of index in an array
        int subArray[] = { 10, 5, 8, 6, 12, 2};
        Arrays.sort(subArray, 1, 4); // sort from index 1 to index 4 (index 4 is not included)
        System.out.println("Array: " + Arrays.toString(subArray));

        // Bakit tayo gumamit ng Arrays.toString?
        // if not, hashcode yung output ng sysout(arr)
        // if not, need pa natin mag forloop para matraverse and print yung arr.
        //if yes, mas mabilis mag print, and its not like we are storing the string, we just want to display it right?

        //So ang purpose ng Arrays.toString is to convert hashcodes into array?
        //No, it converts array into string

    }
}
