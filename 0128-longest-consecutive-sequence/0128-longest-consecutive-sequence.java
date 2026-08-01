class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int val : nums) {
            hashSet.add(val);
        }

        int length = 0;

        for (int num : hashSet) {
            if (!hashSet.contains(num - 1)) {
                int currNum = num;
                int currLen = 1;

                while (hashSet.contains(currNum + 1)) {
                    currNum++;
                    currLen++;
                }
                length = Math.max(currLen, length);
            }
        }
        return length;
    }
}