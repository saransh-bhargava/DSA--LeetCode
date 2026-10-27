class Solution {
    public int climbStairs(int n) {
        if(n <= 3) return n;

        int curr1 = 1;
        int curr2 = 2;
        

        for(int i = 3; i <= n; i++){
            int curr = curr1 + curr2;
            curr1 = curr2;
            curr2 = curr;
        }
        return curr2;
    }
}