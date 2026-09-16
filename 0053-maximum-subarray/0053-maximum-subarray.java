class Solution {
    public int maxSubArray(int[] nums) {
        return maxSubArray1(nums,0,nums.length-1);
    }
    public int maxSubArray1(int[] arr, int left, int right){
        if(left == right){
            return arr[left];
        }
        int mid = left + (right - left)/2;

        int leftMax = maxSubArray1(arr, left, mid);
        int rightMax = maxSubArray1(arr, mid + 1, right);
        int crossMax = maxCrossingSum(arr, left, mid, right);

        return Math.max(Math.max(leftMax, rightMax), crossMax);
    }

    public int maxCrossingSum(int[] arr, int left, int mid, int right){
        int leftSum = Integer.MIN_VALUE;
    int sum = 0;
    for (int i = mid; i >= left; i--) {
        sum += arr[i];
        leftSum = Math.max(leftSum, sum);
    }

    int rightSum = Integer.MIN_VALUE;
    sum = 0;
    for (int i = mid + 1; i <= right; i++) {
        sum += arr[i];
        rightSum = Math.max(rightSum, sum);
    }

    return leftSum + rightSum;
    }


}