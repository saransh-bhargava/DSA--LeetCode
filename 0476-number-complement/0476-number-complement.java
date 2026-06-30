class Solution {
    public int findComplement(int num) {
        long power = 1;
        int result = 0;
        while(num != 0){
            int digit = num % 2;

            if(digit == 1) digit = 0;
            else digit = 1;

            result += digit * power;
            power *= 2; 
            num /= 2;
        }
        return result;
    }
}