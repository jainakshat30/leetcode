import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>[][] dp = new ArrayList[n + 1][n + 1];
        return helper(n, n, dp);
    }

    private List<String> helper(int open, int close, List<String>[][] dp) {
        if (dp[open][close] != null) return dp[open][close];

        List<String> ans = new ArrayList<>();

        if (open == 0 && close == 0) {
            ans.add("");
            return dp[open][close] = ans;
        }

        if (open > 0) {
            for (String s : helper(open - 1, close, dp)) {
                ans.add("(" + s);
            }
        }

        if (close > open) {
            for (String s : helper(open, close - 1, dp)) {
                ans.add(")" + s);
            }
        }

        dp[open][close] = ans;
        return ans;
    }
}