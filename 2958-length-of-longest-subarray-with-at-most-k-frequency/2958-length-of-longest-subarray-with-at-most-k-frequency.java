class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n = nums.length;

        int left = 0;
        int maxLen = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int right = 0; right < n; right++){
            int val = nums[right];
            map.put(val, map.getOrDefault(val,0) + 1);

            while(map.get(val) > k){
                map.put(nums[left],map.getOrDefault(nums[left] , 0) - 1);
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}