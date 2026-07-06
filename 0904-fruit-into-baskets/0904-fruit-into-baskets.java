class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int left = 0;
        int maxLength = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for(int right = 0; right < n ;right++){
            int value = fruits[right];
            map.put(value , map.getOrDefault(value , 0 ) + 1 );

            while(map.size() > 2 ){
                int leftValue = fruits[left];
                map.put(leftValue , map.get(leftValue) - 1);
                if(map.get(leftValue) == 0){
                    map.remove(leftValue);
                }
                left++;
            }

            maxLength = Math.max(maxLength , right - left + 1);
        }

        return maxLength;
    }
}