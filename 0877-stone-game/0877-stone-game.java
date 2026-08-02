class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[n][n];
        
        // Base case: subarrays of length 1
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }
        
        // length = current subarray size
        for (int length = 2; length <= n; length++) {
            for (int i = 0; i + length - 1 < n; i++) {
                int j = i + length - 1;
                int pickLeft  = piles[i] - dp[i + 1][j];
                int pickRight = piles[j] - dp[i][j - 1];
                dp[i][j] = Math.max(pickLeft, pickRight);
            }
        }
        
        // If Player 1's best difference on [0..n-1] is >= 0, they can win or tie
        return dp[0][n - 1] >= 0;

    }
}