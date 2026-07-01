class Solution {
    public int bitwiseComplement(int n) {
        int power = 1;
        int ans = 0;
        if(n == 0) return 1;
        while(n != 0){
            int digit = n % 2;
            digit = digit == 1 ? 0 : 1;

            ans += digit * power;
            power *= 2;
            n /= 2;
        }
        return ans;
    }
}