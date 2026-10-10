class Solution {
    public String sortVowels(String s) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> Integer.compare(b.getValue(), a.getValue()));
        

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<Character,Integer> entry : list){
            for(int i = 0; i < entry.getValue(); i++){
                sb.append(String.valueOf(entry.getKey()));
            }
        }

        StringBuilder result = new StringBuilder();
        int idx = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result.append(String.valueOf(sb.charAt(idx++)));
            } else {
                result.append(String.valueOf(ch));
            }
        }
        return result.toString();
    }
}