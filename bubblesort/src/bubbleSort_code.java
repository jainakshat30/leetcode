import java.util.Arrays;

public class bubbleSort_code {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-1,-2,-3,-4,-5,-6};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        //run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for each step max number will come at last index
            for (int j = 1; j < arr.length - i; j++) {
                //swap it the item is smaller than the previous item
                if (arr[j] < arr[j-1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            //if there is no swap for any index value i then it will break the loop cause otherwise it'll just run for n-1 times
            if (!swapped) {
                break;
            }
        }
    }
}
