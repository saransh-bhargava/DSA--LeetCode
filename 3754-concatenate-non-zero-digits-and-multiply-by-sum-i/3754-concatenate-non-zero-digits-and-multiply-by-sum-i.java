class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        long digitSum = 0;
        long multiplier = 1;
        while(n != 0){
            int digit = n % 10;
            if(digit != 0){
                x = digit * multiplier + x;
                multiplier *= 10;
            }
            digitSum += digit;
            n /= 10;
        }
        return digitSum * x;
    }
}