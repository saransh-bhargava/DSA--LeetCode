class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();

        int n = s.length();
        boolean[] remove = new boolean[n];

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

        while(!stack.isEmpty()) {
            remove[stack.pop()] = true;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < n; i++){
            if(remove[i] == false){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}