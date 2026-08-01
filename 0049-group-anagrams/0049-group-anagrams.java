class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String val = new String(chArr);
            if (!map.containsKey(val)) {
                map.put(val, new ArrayList<>());
            }
            map.get(val).add(str);
        }
        
        return new ArrayList<>(map.values());
    }
}