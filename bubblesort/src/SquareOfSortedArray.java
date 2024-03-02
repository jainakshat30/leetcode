import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,5,7};
        System.out.println(Arrays.toString(sortedSquares(arr)));
    }
    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for(int i = 0;i < nums.length; i++){
            arr[i] = nums[i]*nums[i];
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
