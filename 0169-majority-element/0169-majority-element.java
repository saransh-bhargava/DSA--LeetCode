class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int maxfreq = 0;
        int maxfreqValue = 0;
        int n = nums.length;
        for (int value : nums) {
            map.put(value, map.getOrDefault(value, 0) +1 );

            int freq = map.get(value);
            if(freq > maxfreq && freq > n / 2){
                maxfreqValue = value;
            }
        }
        return maxfreqValue;
    }
}