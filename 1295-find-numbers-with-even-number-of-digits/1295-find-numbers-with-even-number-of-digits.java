class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int value : nums){
            if(value >= 10 && value <= 99 || value >= 1000 && value <= 9999 || value >= 100000 && value <= 999999  ){
                count++;
            }
        }
        return count;
    }
}