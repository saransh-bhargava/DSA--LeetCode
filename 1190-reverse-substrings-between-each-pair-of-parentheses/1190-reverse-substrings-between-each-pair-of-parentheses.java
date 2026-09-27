class Solution {
    public String reverseParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        
        Stack<StringBuilder> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(') {
                stack.push(sb);
                sb = new StringBuilder();
            }
            else if(ch == ')') {
                sb.reverse();
                StringBuilder prev = stack.pop();
                prev.append(sb);
                sb = prev;
            }else{
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}