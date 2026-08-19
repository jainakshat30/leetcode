import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>[][] memo = new ArrayList[n + 1][n + 1];
        return helper(n, n, memo);
    }

    private List<String> helper(int open, int close, List<String>[][] memo) {
        if (memo[open][close] != null) return memo[open][close];

        List<String> ans = new ArrayList<>();

        if (open == 0 && close == 0) {
            ans.add("");
            return memo[open][close] = ans;
        }

        if (open > 0) {
            for (String s : helper(open - 1, close, memo)) {
                ans.add("(" + s);
            }
        }

        if (close > open) {
            for (String s : helper(open, close - 1, memo)) {
                ans.add(")" + s);
            }
        }

        memo[open][close] = ans;
        return ans;
    }
}