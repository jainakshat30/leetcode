class Solution {
    private int[][] dp;
    private int[] suffix;
    private int n;
    public int stoneGameII(int[] piles) {
        n = piles.length;
        dp = new int[n][n + 1];
        suffix = new int[n + 1];

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + piles[i];
        }

        return ans(0, 1);
    }

    int ans(int i, int m){
        if(i >= n) return 0;

        if(2 * m >= n-i){
            return suffix[i];
        }

        if(dp[i][m] != 0){
            return dp[i][m];
        }

        int best = 0;

        for (int x = 1; x <= 2 * m; x++) {
            best = Math.max(best, suffix[i] - ans(i + x, Math.max(m, x)));
        }

        return dp[i][m] = best;
    }
}