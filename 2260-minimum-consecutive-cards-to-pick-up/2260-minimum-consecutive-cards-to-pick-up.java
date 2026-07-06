class Solution {
    public int minimumCardPickup(int[] cards) {
        int n = cards.length;
        int minLength = Integer.MAX_VALUE;

        int left = 0;
        int currLength = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            int rightVal = cards[right];
            
            while (map.containsKey(rightVal)) {
                int leftVal = cards[left];
                map.put(leftVal, map.getOrDefault(leftVal, 0) - 1);
                if (map.get(leftVal) == 0) {
                    map.remove(leftVal);
                }
                minLength = Math.min(minLength, right - left + 1);
                left++;
            }
            map.put(rightVal , map.getOrDefault(rightVal , 0) + 1);
            
        }

        if (minLength == Integer.MAX_VALUE)
            return -1;
        return minLength;
    }
}