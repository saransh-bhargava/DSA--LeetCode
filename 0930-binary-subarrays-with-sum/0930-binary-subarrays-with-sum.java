class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n = nums.length;

        int currSum = 0;
        int count = 0;
        int left = 0, right = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        while (right < n) {
            if (nums[right] == 1)
                currSum++;

            count += map.getOrDefault(currSum - goal, 0);
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
            right++;
        }
        return count;
    }
}