class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] num = new boolean[nums.length + 1];
        for(int value : nums){
            num[value] = true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++){
            if(num[i] == false){
                list.add(i);
            }
        }
        return list;
    }
}