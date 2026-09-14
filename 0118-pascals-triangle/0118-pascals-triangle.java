class Solution {
    public static List<List<Integer>> PascalTriangle(int numsRows, List<List<Integer>> result, List<Integer> list){
        if(numsRows < 2){
            return result;
        }
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        for(int i = 0; i < list.size() - 1; i++){
            list1.add(list.get(i) + list.get(i + 1));
        }
        list1.add(1);
        result.add(list1);
        return PascalTriangle(numsRows - 1, result, list1);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        return PascalTriangle(numRows , result ,list);
    }
}