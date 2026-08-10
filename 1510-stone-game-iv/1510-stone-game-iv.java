class Solution {

    public boolean winnerSquareGame(int n) {
        boolean[] dp = new boolean[n + 1];

        // dp[0] = false by default

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k * k <= i; k++) {

                // If there is a move that leaves
                // the opponent in a losing state
                if (dp[i - k * k] == false) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[n];
    }
}