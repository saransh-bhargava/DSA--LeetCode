class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;

        int currMax = nums[0];
        int maxSoFar = nums[0];

        int currMin  = nums[0];
        int minSoFar = nums[0];

        int totalSum = 0;

        for(int i = 0; i < n; i++){
            totalSum += nums[i];
            if(i > 0){
                currMax = Math.max(nums[i] , nums[i] + currMax);
                maxSoFar = Math.max(currMax, maxSoFar);

                currMin = Math.min(nums[i] , nums[i] + currMin);
                minSoFar = Math.min(currMin, minSoFar);
            }
            
        }
        if(maxSoFar < 0) return maxSoFar;
        return Math.max(totalSum - minSoFar, maxSoFar);
        
    }
}