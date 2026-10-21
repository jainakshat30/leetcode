class Solution {

    public int numIslands(char[][] grid) {

        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (grid[i][j] == '1') {
                    dfs(grid, i, j);
                    count++;
                }
            }
        }

        return count;
    }

    public void dfs(char[][] grid, int i, int j) {

        // Out of bounds
        if (i < 0 || i >= grid.length ||
            j < 0 || j >= grid[0].length) {
            return;
        }

        // If water, stop
        if (grid[i][j] == '0') {
            return;
        }

        // Mark current land as visited
        grid[i][j] = '0';

        // Down
        dfs(grid, i + 1, j);

        // Up
        dfs(grid, i - 1, j);

        // Right
        dfs(grid, i, j + 1);

        // Left
        dfs(grid, i, j - 1);
    }


    public void bfs(char[][] grid, int i, int j){
        
    }
}