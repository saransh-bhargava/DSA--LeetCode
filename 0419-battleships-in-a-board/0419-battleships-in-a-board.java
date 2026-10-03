class Solution {
    public int countBattleships(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        int count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'X') {
                    count++;
                    dfs(board, i, j);
                }
            }
        }
        return count;
    }

    public void dfs(char[][] board, int r, int c) {
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length || board[r][c] != 'X') {
            return;
        }

        board[r][c] = '.';
        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
}