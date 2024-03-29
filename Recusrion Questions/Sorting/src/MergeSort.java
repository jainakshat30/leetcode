import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {38,27,43,10,15,12};
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        //if length of array is equal to one then it'll simply return the array
        if(arr.length == 1){
            return arr;
        }
        //finding the middle element for splitting it
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        //calling the merge function for merging the two sub arrays at every level
        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second){
        int[] ans = new int[first.length + second.length];

        int i = 0; //for left array
        int j = 0; //for right array
        int k = 0;

        while(i < first.length && j < second.length){
            if (first[i] < second[j]){
                ans[k] = first[i];
                i++;
            } else {
                ans[k] = second[j];
                j++;
            }
            k++;
        }

        //in case one of the array is not complete so for copying the remaining element
        while (i < first.length) {
            ans[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            ans[k] = second [j];
            j++;
            k++;
        }

        return ans;
    }
}
