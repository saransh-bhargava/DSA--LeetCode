class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int n = nums.length;

        Set<Integer> set = new HashSet<>();
        int smallest = 100;
        int largest = 1;
        for(int num : nums){
            set.add(num);
            smallest = Math.min(smallest,num);
            largest = Math.max(largest,num);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = smallest; i < largest; i++){
            if(!set.contains(i)){
                result.add(i);
            }
        }
        return result;
    }
}