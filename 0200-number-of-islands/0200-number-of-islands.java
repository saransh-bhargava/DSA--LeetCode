class Solution {

    int[][] directions = {
        {-1, 0},
        {1,0},
        {0, -1},
        {0, 1}
    };


    public int numIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int maxCount = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    maxCount++;

                    dfs(grid, i, j);
                }


            }
        }
        return maxCount;
        
    }

    public void dfs(char[][] grid, int r, int c){
        
        if(r < 0|| c < 0 || r >= grid.length || c >= grid[0].length) return;

        if(grid[r][c] != '1') return;

        grid[r][c] = '0';

        for(int[] intervals : directions){

            int newRow = r + intervals[0];
            int newCol = c + intervals[1];

            dfs(grid, newRow, newCol);
        }
    }
}