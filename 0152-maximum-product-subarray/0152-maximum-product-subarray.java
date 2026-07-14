class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currMin = nums[0];
        int currMax = nums[0];
        
        int totalMax = nums[0];

        for (int i = 1; i < n; i++) {
            int prevMin = currMin;
            

            currMin = Math.min(nums[i], Math.min(nums[i] * currMax , nums[i] * prevMin));
            currMax = Math.max(nums[i], Math.max(nums[i] * currMax , nums[i] * prevMin));

            totalMax = Math.max(totalMax , currMax);
            
        }
        return totalMax;

    }
}