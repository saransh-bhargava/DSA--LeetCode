class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;

        int currSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int count = 0;

        for (int num : nums) {
            currSum += num;

            int mod = ((currSum % k) + k) % k;
            count += map.getOrDefault(mod, 0);
            map.put(mod, map.getOrDefault(mod, 0) + 1);
        }

        return count;
    }
}