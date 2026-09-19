class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Character, Integer> entry : list){
            char ch = entry.getKey();
            int value = entry.getValue();
            while(value != 0){
                result.append(ch);
                value--;
            }
        }
        return result.toString();
    }
}