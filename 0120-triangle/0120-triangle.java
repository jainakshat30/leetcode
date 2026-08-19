class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();

        int[][] dp = new int[n][n];

        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        int ans = helper(0,0,triangle,dp);
        return ans;
    }

    int helper(int index, int row,List<List<Integer>> triangle, int[][] dp) {

    if (row == triangle.size() - 1) {
        return triangle.get(row).get(index);
    }
    if(dp[index][row] != Integer.MAX_VALUE) return dp[index][row];

    int left = helper(index, row + 1,triangle,dp);
    int right = helper(index + 1, row + 1,triangle,dp);

    return dp[index][row] = triangle.get(row).get(index) + Math.min(left, right);
}
}