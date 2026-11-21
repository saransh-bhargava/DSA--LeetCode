class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;

        int trapWater = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {

            if (height[left] <= height[right]) {

                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    trapWater += leftMax - height[left];
                }
                left++;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    trapWater += rightMax - height[right];
                }
                right--;
            }

        }
        return trapWater;
    }
}