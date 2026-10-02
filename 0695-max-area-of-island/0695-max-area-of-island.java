class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        int maxArea = 0;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(grid[i][j] == 1){
                    int currentArea = dfs(grid, i, j);
                maxArea = Math.max(maxArea, currentArea);
                }
            }
        }
        return maxArea;
    }

    public int dfs(int[][] grid, int row, int col){
        int rows = grid.length;
        int cols = grid[0].length;

        if(row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == 0){
            return 0;
        }

        grid[row][col] = 0;

        int currentArea= 1;
        currentArea += dfs(grid, row - 1, col);
        currentArea += dfs(grid, row + 1, col);
        currentArea += dfs(grid, row , col - 1);
        currentArea += dfs(grid, row , col + 1);
        return currentArea;
    }
}