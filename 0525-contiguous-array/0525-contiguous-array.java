class Solution {
    public int findMaxLength(int[] nums) {
        int n = nums.length;

        int maxLen = 0;

        int currSum = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,-1);

        for(int i = 0; i < n; i++){
            if(nums[i] == 0) currSum--;
            else currSum++;
            if(map.containsKey(currSum)){
                int len = i - map.get(currSum);
                maxLen = Math.max(maxLen, len);
            }
            else{
                 map.put(currSum, i);
            }
        }
    
        return maxLen;
    }
}