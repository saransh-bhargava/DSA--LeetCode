class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n   = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int value : nums){
            map.put(value , map.getOrDefault(value, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for(int value : map.keySet()){
            if(map.get(value) > n / 3) list.add(value);
        }
        return list;
    }
}