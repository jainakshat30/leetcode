import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
//        int[][] arr = new int[3][]; //adding number of coloumn is not mandatory
            Scanner in = new Scanner(System.in);
//        int[][] arr = {
//                {1, 2, 3}, //0th index
//                {4, 5},     //1st index
//                {6, 7, 8, 9}    //2nd index
//        };
//        System.out.println(Arrays.toString(arr[1]));

        int[][] arr = new int[3][3];
        System.out.println(arr.length); // prints number of row
        //input
        for (int row = 0; row < arr.length; row++) {
                    //for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
                
            }
        }

//        for (int row = 0; row < arr.length; row++) {
//            //for each col in every row
//            for (int col = 0; col < arr[row].length; col++) {
//                System.out.print(arr[row][col] + " ");
//
//            }
//            System.out.println();
//        }

//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        for (int[] a : arr){                       //enhanced for loop
            System.out.println(Arrays.toString(a));
        }

    }
}
