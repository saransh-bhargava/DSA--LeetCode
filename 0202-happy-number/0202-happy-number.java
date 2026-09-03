class Solution {
    public static int getNumber(int n){
        int sum = 0;
        while(n != 0){
            sum += (n % 10) * (n % 10);
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
       int slow = getNumber(n);
       int fast = getNumber(getNumber(n));

       while(fast != 1){
            if(slow == fast) return false;
            slow = getNumber(slow);
            fast = getNumber(getNumber(fast));
       }
       return true;
    }
}