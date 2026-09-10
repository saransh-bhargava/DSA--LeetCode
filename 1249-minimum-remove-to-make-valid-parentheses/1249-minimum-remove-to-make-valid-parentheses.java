class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        
        boolean[] remove = new boolean[s.length()];

        StringBuilder result = new StringBuilder();
        int index = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                stack.push(index);
            }else if(ch == ')'){
                if(!stack.isEmpty()){
                    stack.pop();
                }else{
                    remove[index] = true;
                }
            }
            index++;
        }

        while(!stack.isEmpty()){
            remove[stack.pop()] = true;
        }

        index = 0;
        for(char ch : s.toCharArray()){
            if(remove[index] == false){
                result.append(ch);
            }
            index++;
        }

        return result.toString();
    }
}