class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack = new Stack<>();

        if(s.length() == 0) return 0;
        int insertion = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(ch);
                
            }else{
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    insertion++;
                }
            }
        }
        return insertion + stack.size();
    }
}