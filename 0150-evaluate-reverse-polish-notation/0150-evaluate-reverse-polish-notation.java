class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String operator = "+-*/";
        for(String token : tokens){
            if(operator.contains(token)){

            
            int a = stack.pop();
            int b = stack.pop();

            switch(token){
                case "+" :{
                    stack.push(b + a);
                    break;
                }
                case "-" :{
                    stack.push(b - a);
                    break;
                }
                case "*" :{
                    stack.push(b * a);
                    break;
                }
                case "/" :{
                    stack.push(b/a);
                    break;
                }
             }
            }else{
                stack.push(Integer.parseInt(token));
            }

        }
        return stack.peek();
    }
}