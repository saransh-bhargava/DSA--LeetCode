class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;

        int left = 0;
        int countOne = 0;
        int countZero = 0;
        int maxOnes = 0;

        for(int right = 0; right < n ; right++){
            if(nums[right] == 0){
                countZero++;
            }else countOne++;

            while(countZero > k && left <= right){
                if(nums[left] == 0){
                    countZero--;
                }else countOne--;
                left++;
            }
            maxOnes = Math.max(maxOnes, countOne + countZero);
        }

        return maxOnes;
    }
}