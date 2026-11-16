class Solution {
    public int digitSum(String str){
        int digitSum = 0;
        for(char ch : str.toCharArray()){
            digitSum += ch - '0';
        }
        return digitSum;
    }
    public String digitSum(String s, int k) {
        while (s.length() > k) {
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < s.length(); i+=k) {
                if (i + k > s.length()) {
                    int num = digitSum(s.substring(i, s.length()));
                    String str = String.valueOf(num);
                    sb.append(str);
                } else {
                    int val = digitSum(s.substring(i, i + k));
                    String str = String.valueOf(val);
                    sb.append(str);
                }
            }
            s = sb.toString();
        }
        return s;
    }
}