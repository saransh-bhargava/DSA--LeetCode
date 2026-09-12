class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String str : tokens) {
            switch (str) {
                case "+": {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a + b);
                    break;
                }
                case "-": {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                    break;
                }
                case "*": {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(a * b);
                    break;
                }
                case "/": {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                    break;
                }
                default: {
                    int value = Integer.parseInt(str);
                    stack.push(value);
                    break;
                }
            }
        }
        return stack.peek();
    }
}