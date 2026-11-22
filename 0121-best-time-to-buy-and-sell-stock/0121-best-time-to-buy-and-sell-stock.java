class Solution {
    public int maxProfit(int[] prices) {
        int currMinPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int price : prices){
            currMinPrice = Math.min(currMinPrice, price);
            maxProfit = Math.max(maxProfit, price - currMinPrice);
        }
        return maxProfit;
    }
}