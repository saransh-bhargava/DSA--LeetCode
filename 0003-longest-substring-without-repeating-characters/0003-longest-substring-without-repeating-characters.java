class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;
        StringBuilder sb = new StringBuilder();
        for(int right = 0; right < n; right++){
            char ch = s.charAt(right);
            while(sb.toString().contains(String.valueOf(ch))){
                sb.deleteCharAt(0);
                left++;
            }
            sb.append(ch);
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}