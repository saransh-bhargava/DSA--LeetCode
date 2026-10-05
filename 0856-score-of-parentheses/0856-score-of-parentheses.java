class Solution {
    public int scoreOfParentheses(String s) {
        int count = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(0);
            }

            if(ch == ')'){
                int v = stack.pop();
                stack.push(stack.pop() + Math.max(2 * v, 1));
            }
        }

        return stack.pop();
    }
}