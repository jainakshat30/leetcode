import java.util.Arrays;
import java.util.Scanner;

class SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 4;
        int[][] result = generateMatrix(n);
        printMatrix(result);
    }
    public static int[][] generateMatrix(int n) {
        int rowbegin = 0;
        int rowend = n-1;
        int colbegin = 0;
        int colend = n-1;
        int value = 1;
        int matrix[][] = new int[n][n];

        while(rowbegin < rowend && colbegin < colend) {
            //traverse right
            for (int i = colbegin; i <= colend; i++) {
                matrix[rowbegin][i] = value++;
            }
            rowbegin++;
            
            //traverse bottom
            for (int i = rowbegin; i <= rowend; i++) {
                matrix[i][colend] = value++;
            }
            colend--;

            //traverse left
            for (int i = colend; i >= colbegin; i--) {
                matrix[rowend][i] = value++;
            }
            rowend--;

            //traverse up
            for (int i = rowend; i >= rowbegin; i--){
                matrix[i][colbegin] = value++;
            }
            colbegin++;
        }
        return matrix;
    }
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
    }
