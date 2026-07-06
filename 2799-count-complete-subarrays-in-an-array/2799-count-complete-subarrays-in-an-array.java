class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> completeSet = new HashSet<>();

        for(int value : nums){
            completeSet.add(value);
        }
        int distinctElements = completeSet.size();
        int left = 0;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();

        for(int right = 0; right < n ; right++){
            map.put(nums[right] , map.getOrDefault(nums[right] , 0) + 1);
        
            while(map.size() == distinctElements){

                count += n - right;
                int leftVal  = nums[left];

                map.put(leftVal , map.getOrDefault(leftVal , 0) - 1);

                if(map.get(leftVal) == 0){
                    map.remove(leftVal);
                }

                left++;
            }
        }
        return count;
    }
}