class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        // Edge case: only one house
        if (n == 1) {
            return nums[0];
        }

        // Case 1: Leave out the first house
        int case1 = robRange(nums, 1, n - 1);

        // Case 2: Leave out the last house
        int case2 = robRange(nums, 0, n - 2);

        return Math.max(case1, case2);
    }

    int robRange(int[] nums, int start, int end) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return f(end, nums, dp, start);
    }

    int f(int index, int[] nums, int[] dp, int start) {
        if (index < start) {
            return 0;
        }

        if (index == start) {
            return nums[index];
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        int pick = nums[index] + f(index - 2, nums, dp, start);
        int notPick = f(index - 1, nums, dp, start);

        return dp[index] = Math.max(pick, notPick);
    }
}