class Solution {
    public int divisorSubstrings(int num, int k) {
        int count = 0;

        String numStr = String.valueOf(num);
        int n = numStr.length();
        for(int i = 0; i <= n - k; i++){
            String  str = numStr.substring(i , i + k);
            int original = Integer.parseInt(str);
            if(original == 0) continue;
            if(num % original == 0) count++;
        }
        return count;
    }
}