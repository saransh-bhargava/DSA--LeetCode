class Solution {
    public int minInsertions(String s) {
        Stack<Character> stack = new Stack<>();

        boolean check  = false;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(check == true) count++;
                stack.push(ch);
            }else{
                if(stack.isEmpty()) {
                    stack.push('(');
                    count++;
                }

                if(check){
                    stack.pop();
                }
                check = !check;
            }
        }
        count += (check == false) ? stack.size() * 2 : stack.size() * 2 - 1;
        return  count;
    }
}