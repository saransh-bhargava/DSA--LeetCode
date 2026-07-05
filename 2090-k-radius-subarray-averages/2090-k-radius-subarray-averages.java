class Solution {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        long windowSum = 0;
        int windowSize = 2 * k + 1;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        if (windowSize > n)
            return result;
        
        int index = k;
        

        for (int i = 0; i < n; i++) {
            windowSum += nums[i];
            if(i >= windowSize){
                windowSum -= nums[i - windowSize];
            }
            if(i >= windowSize - 1){
                result[index++] = (int) (windowSum / windowSize);
            }
        }
        return result;
    }
}