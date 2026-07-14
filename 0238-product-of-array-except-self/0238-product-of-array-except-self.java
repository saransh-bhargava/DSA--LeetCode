class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        long product = 1;
        int zeroCount = 0;
        for(int value : nums){
            if(value == 0) {
                zeroCount++;
                continue;
            }

            product *= value;
            
        }
        if(zeroCount > 1){
            Arrays.fill(nums, 0);
            return nums;
        }

        for(int i = 0; i < n ; i++){
            if(nums[i] == 0) {
                Arrays.fill(nums, 0);
                nums[i] = (int) product;
                return nums;
            }
            nums[i] = (int) product / nums[i];
        }

        
        return nums;
    }
}