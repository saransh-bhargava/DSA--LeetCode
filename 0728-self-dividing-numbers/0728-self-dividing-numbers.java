class Solution {
    public static boolean checkDivisor(int num){
        int temp = num;
        while(temp != 0){
            int digit = temp % 10;
            if(digit == 0) return false;
            if(num % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left ; i <= right; i++){
            if(checkDivisor(i)){
                list.add(i);
            }
        }
        return list;
    }
}