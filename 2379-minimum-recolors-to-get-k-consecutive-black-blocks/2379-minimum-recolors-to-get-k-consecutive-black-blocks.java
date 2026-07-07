class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minWhite = Integer.MAX_VALUE;
        int currWhite = 0;
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                currWhite++;
            }
        }

        minWhite = Math.min(minWhite, currWhite);

        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i) == 'W') {
                currWhite++;
            }

            if (blocks.charAt(i - k) == 'W') {
                currWhite--;
            }

            minWhite = Math.min(minWhite, currWhite);
        }
        return minWhite;
    }
}