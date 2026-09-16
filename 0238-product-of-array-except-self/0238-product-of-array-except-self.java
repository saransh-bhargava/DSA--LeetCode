class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int countZero = 0;

        long product = 1;
        for(int num : nums){
            if(num == 0) {
                countZero++;
                
            }else{
                product *= num;
            }
        }

        for(int i = 0; i < n; i++){
            if(countZero == 1 ){
                if(nums[i] == 0){
                    nums[i] = (int) product;
                }else{
                    nums[i] = 0;
                }
                
            }else if(countZero > 1){
                nums[i] = 0;
            }else{
                nums[i] = (int) (product / nums[i]);
            }
        }
        return nums;
    }
}