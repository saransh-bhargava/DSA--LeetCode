class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder sb = new StringBuilder();
        HashMap<String,String> map = new HashMap<>();

        for(List<String> list : knowledge){
            map.put(list.get(0), list.get(1));
        }

        String[] strArray = s.split("\\(");

        for(String str : strArray){
            int closeIdx = str.indexOf(")");
            if(closeIdx != -1){
                String key = str.substring(0, closeIdx);
                sb.append(map.getOrDefault(key, "?"));
                sb.append(str.substring(closeIdx + 1, str.length()));
            }else{
                sb.append(str);
            }
        }

        return sb.toString();
    }
}