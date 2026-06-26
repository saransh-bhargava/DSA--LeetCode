class Solution {
    public String convertToBase7(int num) {
        int absoluteNum = Math.abs(num);
        if(num == 0) return "0";
        String result = "";
        while(absoluteNum != 0){
            int digit = absoluteNum % 7;
            result = String.valueOf(digit) + result;
            absoluteNum /= 7;
        }
        if(num < 0) return "-" + result;
        return result;
    }
}