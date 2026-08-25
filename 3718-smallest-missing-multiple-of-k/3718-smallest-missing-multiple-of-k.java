class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int val : nums) {
            set.add(val);
        }
        int currMul = k;
        while (true) {
            if (!set.contains(currMul)) {
                break;
            }
            currMul += k;
        }
        return currMul;
    }
}