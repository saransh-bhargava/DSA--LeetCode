class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);
        int currentSum = 0;
        int maxLen = 0;
        for(int i = 0; i < n;i++){
            if(nums[i] == 1) currentSum++;
            else currentSum--;


            if(map.containsKey(currentSum)){
                int len = i - map.get(currentSum);
                maxLen = Math.max(maxLen, len);
            }else{
                map.put(currentSum , i);
            }


        }
        return maxLen;
    }
}