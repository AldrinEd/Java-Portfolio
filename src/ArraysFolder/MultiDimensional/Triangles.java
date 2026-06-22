package ArraysFolder.MultiDimensional;

public class Triangles {
    
    //Printing triangles using Jagged Array (multi-dimensional array where each row can have different number of columns)
    
    public static void main(String[] args) {
    
        int r = 5;

        String[][] arr = new String[r][];
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = new String[i+1];
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = "*";
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println(" ");
        }
    }
}
