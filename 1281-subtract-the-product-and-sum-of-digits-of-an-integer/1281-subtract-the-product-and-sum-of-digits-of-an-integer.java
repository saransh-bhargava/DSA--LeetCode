class Solution {
    public int subtractProductAndSum(int n) {
        long product = 1;
        long sum = 0;
        while(n != 0){
            int digit = n % 10;
            product *= digit;
            sum += digit;
            n /= 10;
        }

        return (int)(product - sum);
    }
}