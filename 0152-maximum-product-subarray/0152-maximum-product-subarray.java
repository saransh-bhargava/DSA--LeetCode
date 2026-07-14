class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int currMin = nums[0];
        int currMax = nums[0];
        
        int totalMax = nums[0];

        for (int i = 1; i < n; i++) {
            int prevMax = currMax;
            

            currMax = Math.max(nums[i], Math.max(nums[i] * prevMax , nums[i] * currMin));
            currMin = Math.min(nums[i], Math.min(nums[i] * prevMax , nums[i] * currMin));

            totalMax = Math.max(totalMax , currMax);
            
        }
        return totalMax;

    }
}