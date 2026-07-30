class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        
        int freq = 0;
        for (int val : map.keySet()) {
            int temp = freq;
            freq += map.get(val);
            map.put(val,temp);
        }

        int index = 0;
        for (int val : nums) {
            nums[index++] = map.get(val);
        }
        return nums;
    }
}