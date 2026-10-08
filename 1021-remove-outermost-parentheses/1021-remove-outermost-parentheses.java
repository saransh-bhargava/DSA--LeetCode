class Solution {
    public String removeOuterParentheses(String s) {
        if(s.length() <= 2) return "";

        ArrayList<String> list = new ArrayList<>();
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            sb.append(String.valueOf(ch));
            if(ch == '(') {
                
                stack.push(ch);
            }else{
                stack.pop();
                if(stack.isEmpty()) {
                    list.add(sb.toString());
                    sb.delete(0,sb.length());
                }
            }
        }

        StringBuilder result = new StringBuilder();
        for(String str : list){
            if(str.length() != 2) {
                result.append(str.substring(1, str.length() - 1));
            }
        }
        return result.toString();
    }
}