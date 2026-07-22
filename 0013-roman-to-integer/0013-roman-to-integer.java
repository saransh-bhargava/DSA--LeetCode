class Solution {
    public int romanToInt(String s) {
        int n = s.length();
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
        
        int prev = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = s.charAt(i);
                if (prev > map.get(ch)) {
                    result -= map.get(ch);
                    
                } else {
                    result += map.get(ch);
                }
                prev = map.get(ch);
           
        }
        return result;
    }
}