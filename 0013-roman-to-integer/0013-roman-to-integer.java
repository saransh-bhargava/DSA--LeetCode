class Solution {
    private static int value(char ch) {
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
        }
        return 0;
    }

    public int romanToInt(String s) {
        int n = s.length();

        int result = 0;
        for (int i = 0; i < n; i++) {
            int curr = value(s.charAt(i));
            int next = (i + 1 < n) ? value(s.charAt(i + 1)) : 0;

            if (curr < next) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        return result;
    }
}