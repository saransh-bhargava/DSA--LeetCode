class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int n = s.length();
        int maxCount = 0;

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(') count++;
            if(ch == ')') count--;

            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
}