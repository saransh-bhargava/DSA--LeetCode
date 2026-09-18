class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;

        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int currentSum = 0;
        for (int i = 0; i < n; i++) {
            if (currentSum == (totalSum - currentSum - nums[i])) {
                return i;
            }
            currentSum += nums[i];
        }
        return -1;
    }
}