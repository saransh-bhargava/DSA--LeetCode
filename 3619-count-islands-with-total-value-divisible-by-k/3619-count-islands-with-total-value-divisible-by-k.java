class Solution {
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    long currentSum = dfs(grid, i, j);
                    if (currentSum % k == 0)
                        count++;
                }

            }

        }
        return count;
    }

    public long dfs(int[][] grid, int r, int c) {

        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == 0)
            return 0;

        long currentSum = grid[r][c];
        grid[r][c] = 0;
        currentSum += dfs(grid, r - 1, c);
        currentSum += dfs(grid, r + 1, c);
        currentSum += dfs(grid, r, c - 1);
        currentSum += dfs(grid, r, c + 1);

        return currentSum;

    }
}