package ArraysFolder.MultiDimensional;

import java.util.Scanner;

public class CountEvenAndOdd {

    //Using multi-dimensional Array, count the number of even and odd in the array.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter row: ");
        int row = sc.nextInt();
        System.out.print("Enter column: ");
        int column = sc.nextInt();

        int[][] arr= new int[row][column];

        System.out.println("Enter elements in the array: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("This is your array:");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }

        int even = 0; int odd = 0;

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(arr[i][j] % 2 == 0){
                    even++;
                }
                else{
                    odd++;
                }
            }

        }
        System.out.print("Even: " + even+ "\n");
        System.out.print("Odd: " + odd);

    }
}
