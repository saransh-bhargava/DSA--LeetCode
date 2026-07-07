class Solution {
    public int countGoodSubstrings(String s) {
        int n = s.length();
        if (n < 3)
            return 0;
        char ch1 = s.charAt(0);
        char ch2 = s.charAt(1);
        char ch3 = s.charAt(2);
        int count = 0;
        if (ch1 != ch2 && ch2 != ch3 && ch3 != ch1) {
            count++;
        }
        for (int i = 3; i < n; i++) {
            ch1 = ch2;
            ch2 = ch3;
            ch3 = s.charAt(i);

            if (ch1 != ch2 && ch2 != ch3 && ch3 != ch1) {
                count++;
            }

        }
        return count;
    }
}