class Solution {
    public int[] rearrangeArray(int[] nums) {
        int left = 0, right = 1;
        int n = nums.length;
        int i = 0;

        int[] result = new int[n];
        while((left < n || right < n) && i < n){
            if(nums[i] > 0){
                result[left] = nums[i++];
                left += 2;
            }else{
                result[right] = nums[i++];
                right += 2;
            }
        }
        return result;
    }
}