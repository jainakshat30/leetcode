import java.util.Arrays;

public class mergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSortInPlace(arr,0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace1(arr, s, mid, e);
    }

    private static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }

//without creating any other array
    private static void mergeInPlace1(int[] arr, int s, int m, int e) {
        int start2 = m;
        while (s < m && start2 < e) {
            if (arr[s] <= arr[start2]) {
                s++;
            } else {
                int temp = arr[start2];
                // Shift all the elements between 's' and 'start2' right by one position
                for (int i = start2; i > s; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[s] = temp;
                // Move all pointers one step forward
                s++;
                m++;
                start2++;
            }
        }
    }
}
