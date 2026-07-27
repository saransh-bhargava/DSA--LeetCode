class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> map = new HashMap<>();
        char[] charArray = pattern.toCharArray();
        int n = charArray.length;

        String[] strArray = s.split(" ");
        if(n != strArray.length) return false;
        for (int i = 0; i < n; i++) {
            char ch = charArray[i];
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(strArray[i])) {
                    return false;
                }

            }
            else if(map.containsValue(strArray[i])){
                return false;
            }
            map.put(ch, strArray[i]);
        }
        return true;
    }
}