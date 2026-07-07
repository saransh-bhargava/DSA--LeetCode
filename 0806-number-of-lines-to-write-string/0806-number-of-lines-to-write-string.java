class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int rowCount = 1;
        int currSum = 0;

        for(char ch : s.toCharArray()){
             currSum += widths[ch - 'a'];
             if(currSum > 100){
                rowCount++;
                currSum = 0;
                currSum += widths[ch - 'a'];
             }
        }

        return new int[]{rowCount, currSum};
    }
}