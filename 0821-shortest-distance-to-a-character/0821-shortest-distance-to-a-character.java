class Solution {
    public int[] shortestToChar(String s, char c) {
        int[] result = new int[s.length()];

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length() ;i++){
            if(s.charAt(i) == c) {
                list.add(i);
            }
        }

        for(int i = 0; i < s.length() ;i++){
            int distance = Integer.MAX_VALUE;
            if(s.charAt(i) != c){
                for(int j = 0; j < list.size() ; j++){
                    distance = Math.min(distance,Math.abs(i - list.get(j)));
                }
                result[i] = distance;
            }else{
                result[i] = 0;
            }
        }
        return result;
    }
}