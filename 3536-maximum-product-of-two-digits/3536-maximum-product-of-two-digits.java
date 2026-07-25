class Solution {
    public int maxProduct(int n) {
        int maxDigit = 0;
        int maxProd = 0;

        while(n != 0){
            int digit = n % 10;
            maxProd = Math.max(maxProd , maxDigit * digit);
            maxDigit = Math.max(maxDigit, digit);
            n /= 10;
        }
        return maxProd;
    }
}