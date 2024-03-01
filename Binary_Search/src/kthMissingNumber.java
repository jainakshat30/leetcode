//https://leetcode.com/problems/kth-missing-positive-number/description/
public class kthMissingNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,10,11,14};
        System.out.println(ans(nums,5));
    }

    private static int ans(int[] arr, int k) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high){
            int mid = low + (high - low)/2;
            int missing = arr[mid] - mid+1;
            if (missing < k){
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return high + k + 1;
    }

}
