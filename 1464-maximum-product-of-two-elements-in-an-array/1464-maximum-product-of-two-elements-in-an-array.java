class Solution {
    public int maxProduct(int[] nums) {
        int currMax = 0;
        int maxProd = (nums[0] - 1) * (nums[1] - 1);

        for(int value : nums){
            maxProd = Math.max(maxProd , (currMax - 1) * (value - 1));
            currMax = Math.max(currMax, value);
        }
        return maxProd;
    }
}