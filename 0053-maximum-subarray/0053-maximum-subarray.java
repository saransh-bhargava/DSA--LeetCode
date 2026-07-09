class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currMax = 0;
        int maxSoFar = Integer.MIN_VALUE;

        for(int i = 0; i < n ; i++){
            currMax = Math.max(nums[i] , currMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currMax);
            
        }
        
        return maxSoFar;
    }
}