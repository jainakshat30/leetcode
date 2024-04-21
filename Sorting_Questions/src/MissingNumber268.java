public class MissingNumber268 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,3};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }
    static int missingNumber(int[] nums) {
        int n = nums.length;
        int total_sum = (n)*(n+1)/2;
        int arr_sum = 0;
        for(int i = 0; i < n; i++){
            arr_sum += nums[i];
        }
        return total_sum - arr_sum;
    }
}
