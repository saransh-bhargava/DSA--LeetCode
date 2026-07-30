class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;

        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int val : nums) {
            map.put(val, map.getOrDefault(val, 0) + 1);
        }

        int[] temp = new int[map.size()];

        int index = 0;
        for (int val : map.keySet()) {
            temp[index++] = val;
        }

        Arrays.sort(temp);

        int freq = 0;
        for (int val : temp) {
            int temp1 = freq;
            freq += map.get(val);
            map.put(val, temp1);
        }

        index = 0;
        for (int val : nums) {
            nums[index++] = map.get(val);
        }
        return nums;
    }
}