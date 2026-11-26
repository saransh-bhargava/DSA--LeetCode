class Solution {
    public boolean canAliceWin(int n) {
        int turnValue = 10;
        boolean aliceWin = false;
        while(n >= 1){
            if(n >= turnValue){
                aliceWin = true;
            }
            n -= turnValue--;

            if(n >= turnValue){
                aliceWin = false;
            }
            n -= turnValue--;
        }
        return aliceWin;
    }
}