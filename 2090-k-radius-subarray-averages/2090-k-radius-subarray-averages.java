class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long windowSum = 0;
        int windowSize = 2 * k + 1;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        if (windowSize > n)
            return result;
        for (int i = 0; i < windowSize; i++) {
            windowSum += nums[i];
        }
        int index = k;
        result[index++] = (int) (windowSum / windowSize);

        for (int i = windowSize; i < n; i++) {
            windowSum += nums[i];
            windowSum -= nums[i - windowSize];
            result[index++] = (int) (windowSum / windowSize);
        }
        return result;
    }
}