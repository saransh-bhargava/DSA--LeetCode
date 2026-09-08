class Solution {
    public int countCommas(int n) {
        int count = 0;
        int temp = n;
        while(temp != 0){
            count++;
            temp /= 10;
        }
        if(count < 4) return 0;
        if(count < 6) return n - 999;
        return 99001;
    }
}