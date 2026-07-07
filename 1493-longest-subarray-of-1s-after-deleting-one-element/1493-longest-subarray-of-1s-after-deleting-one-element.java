class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int maxLength = 0;

        int countOne = 0;
        int countZero = 0;

        int left= 0;

        for(int right = 0; right < n; right++){
            if(nums[right] == 0){
                countZero++;
            }else countOne++;

            while(countZero > 1 && left <= right){
                if(nums[left] == 0){
                    countZero--;
                }else countOne--;
                left++;

            }
            if(countZero == 0){
                maxLength = Math.max(maxLength, countOne - 1);
            }else{
                maxLength = Math.max(maxLength, countOne);
            }
            

        }
        return maxLength;
    }
}