class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character , Integer> lastSeen = new HashMap<>();
        int n = s.length();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            if(lastSeen.containsKey(ch) && lastSeen.get(ch) >= left){
                left = lastSeen.get(ch) + 1;
            }
            lastSeen.put(ch , right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}