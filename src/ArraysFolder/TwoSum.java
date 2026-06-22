package ArraysFolder;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {2, 7, 3, 6};
        Scanner sc = new Scanner(System.in);
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.print("Enter your target number: ");
        int target = sc.nextInt();

        twoSum(arr, target);
    }

    public static int[] twoSum(int[]arr, int target){
        
        int size = arr.length;
        boolean found = false;
        for(int i = 0; i < size; i++){
            int diff = target - arr[i];
            for(int j = 0; j < size; j++){
                if(j == i){
                    continue;
                }
                if(diff == arr[j]){
                    System.out.println("Output: [" + i + ", " + j + "]");
                    found = true;
                    break;
                }
            }
            if(found){
                    break;
                }
        }
        
        return arr;
    }
}
