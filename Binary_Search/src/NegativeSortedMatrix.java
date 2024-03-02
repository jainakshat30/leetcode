public class NegativeSortedMatrix {
    public static void main(String[] args) {

    }
    public int countNegatives(int[][] grid) {
        int rowBegin = 0;
        int colBegin = 0;
        int colEnd = grid[0].length - 1;
        int rowEnd = grid.length - 1;
        int count = 0;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            for (int i = colBegin; i <= colEnd; i++) {
                if (grid[rowBegin][i] < 0) {
                    count++;
                }
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                if (grid[i][colEnd] < 0) {
                    count++;
                }
            }
            colEnd--;

            if (rowBegin <= rowEnd) {
                // Traverse Left
                for (int i = colEnd; i >= colBegin; i--) {
                    if (grid[rowEnd][i] < 0) {
                        count++;
                    }
                }
            }
            rowEnd--;

            if (colBegin <= colEnd) {
                // Traverse Up
                for (int i = rowEnd; i >= rowBegin; i--) {
                    if (grid[i][colBegin] < 0) {
                        count++;
                    }
                }
            }
            colBegin++;
        }
        return count;
    }
}
