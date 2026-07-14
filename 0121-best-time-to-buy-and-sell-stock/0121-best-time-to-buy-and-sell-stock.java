class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        int currProf = 0;
        int maxProf = 0;
        int currMin = prices[0];

        for(int i = 1; i < n; i++){
            if(prices[i] < currMin){
                currMin = prices[i];
            }
            currProf = Math.max(currProf , prices[i] - currMin);

            maxProf = Math.max(maxProf, currProf);
        }
        return maxProf;
    }
}