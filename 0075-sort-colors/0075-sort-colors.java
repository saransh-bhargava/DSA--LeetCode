class Solution {

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    public void sortColors(int[] nums) {
        int n = nums.length;

        int left = 0, right = n - 1, mid = 0;
        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            }
            else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, left);
                mid++;
                left++;
            }
        }
    }
}