class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        long currentSum = 0;

        for (int i = 0; i < n; i++) {
            currentSum += nums[i];

            int rem = (int) (currentSum % k);
            if(map.containsKey(rem)){
                if(i - map.get(rem) >= 2){
                    return true;
                }
            }else{
                map.put(rem, i);
            }
        }
        return false;
    }
}