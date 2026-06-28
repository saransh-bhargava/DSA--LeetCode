class Solution {
    public int countPrimeSetBits(int left, int right) {
        boolean[] prime = {false,false,true,true,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,true,false,false,false,true,false,false,false};
        int count = 0;
        for(int i = left ; i <= right; i++){
            int n = Integer.bitCount(i);
            if(prime[n]) count++;
        }
        return count;
    }
}