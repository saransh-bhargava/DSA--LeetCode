class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()) return false;
                char peek = stack.pop();;
                if(ch == ')' && peek != '(') return false;
                if(ch == '}' && peek != '{') return false;
                if(ch == ']' && peek != '[') return false;
                
            }
        }
        return stack.isEmpty();
    }
}