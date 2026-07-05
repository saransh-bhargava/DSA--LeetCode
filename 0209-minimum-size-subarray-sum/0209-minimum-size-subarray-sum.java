class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;

        int currSum = 0;
        int minLength = Integer.MAX_VALUE;
        for(int right = 0; right < n; right++){
            currSum += nums[right];
           
                while(currSum >= target){
                    currSum -= nums[left];
                    minLength = Math.min(minLength, right - left + 1);
                    left++;
                }
            
            
        }
        if(minLength == Integer.MAX_VALUE) return 0;
        return minLength;
    
    }
}