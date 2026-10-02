class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int originalColor = image[sr][sc];
        if(originalColor == color) return image;
        dfs(image,sr,sc,color,originalColor);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int original) {
        int rows = image.length;
        int cols = image[0].length;

        if (sr < 0 || sc < 0 || sr >= rows || sc >= cols || image[sr][sc] != original) {
            return;
        }

        image[sr][sc] = color;

        dfs(image, sr - 1, sc, color, original);
        dfs(image, sr + 1, sc, color, original);
        dfs(image, sr, sc - 1, color, original);
        dfs(image, sr, sc + 1, color, original);
    }
}