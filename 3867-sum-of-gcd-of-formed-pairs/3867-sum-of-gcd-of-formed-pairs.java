class Solution {

    public int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public long gcdSum(int[] nums) {
        int n = nums.length;
        long result = 0;
        int currMax = nums[0];
        for (int i = 0; i < n; i++) {
            currMax = Math.max(nums[i], currMax);
            nums[i] = gcd(currMax, nums[i]);
        }
        Arrays.sort(nums);
        int left = 0, right = n - 1;

        while (left < right) {
            result += gcd(nums[left], nums[right]);
            left++;
            right--;
        }
        return result;
    }
}