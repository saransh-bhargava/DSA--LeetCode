class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int n = seq.length();
        int[] result = new int[seq.length()];
        Stack<Integer> stack = new Stack<>();

        int[] depth = new int[2];
        

        for(int i = 0; i < n; i++){
           if(seq.charAt(i) == '('){
                int g = depth[0] <= depth[1] ? 0 : 1;
                depth[g]++;
                stack.push(g);
                result[i] = g;
           }else{
                int g = stack.pop();
                depth[g]--;
                result[i] = g;
           }
        }

        return result;
    }
}