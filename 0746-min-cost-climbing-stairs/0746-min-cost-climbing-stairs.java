class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length];
        Arrays.fill(dp, -1);
        return Math.min(solve(cost.length - 1,cost, dp), solve(cost.length - 2, cost, dp));
    }

    public int solve(int index, int[] cost, int[] dp){
        if(index < 0) return 0;
        if (index == 0) {
            return cost[0];
        }

        if(dp[index] != -1) return dp[index];

        int oneStep = solve(index - 1, cost,dp);
        int twoStep = solve(index - 2, cost,dp);

        return dp[index] = cost[index] + Math.min(oneStep,twoStep);
    }
}