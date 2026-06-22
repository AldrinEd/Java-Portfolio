package ArraysFolder.ArrayClass;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 10, 2, 34, 8, 29, 15 };
        System.out.println(Arrays.toString(arr));
        System.out.print("What element you want to binary search? - ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();

        binarySearch(arr, key);
    }

    public static int[] binarySearch(int [] arr, int key){
        
        Arrays.sort(arr);

        System.out.println("This sorted Array is: " + Arrays.toString(arr));
        
        System.out.print("The key " + key + " is in: " + Arrays.binarySearch(arr, key));
        return arr;
    }
}
