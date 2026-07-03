class Solution {

    public static List<List<Integer>> pascal(int numRow , int rows , List<List<Integer>> result , List<Integer> previous){
        if(rows == numRow){
            return result;
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i = 0; i < previous.size() - 1; i++){
            list.add(previous.get(i) + previous.get(i + 1));
        }
        list.add(1);
        result.add(list);
        return pascal(numRow , rows + 1, result , list);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
         
        return pascal(numRows , 1 ,result, list);
    }
}