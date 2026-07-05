class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int windowSum = 0;

        for(int i = 0; i < k ; i++){
            windowSum += nums[i];
        }
        
        int maxWindowSum = windowSum;
        for(int i = k; i < n; i++){
            windowSum -= nums[i - k];
            windowSum += nums[i];
            maxWindowSum = Math.max(windowSum , maxWindowSum);
        }
        double average = (maxWindowSum * 1.0) / k;
        return average;
    }
}