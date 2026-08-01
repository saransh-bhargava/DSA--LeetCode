class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        Map<String,List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] chArr = str.toCharArray();
            Arrays.sort(chArr);
            String val = new String(chArr);
            if(map.containsKey(val)){
                List<String> temp = map.get(val);
                temp.add(str);
                map.put(val , temp);
            }else{
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(val,temp);
            }
        }
        for(List<String> list : map.values()){
            result.add(list);
        }
        return result;
    }
}