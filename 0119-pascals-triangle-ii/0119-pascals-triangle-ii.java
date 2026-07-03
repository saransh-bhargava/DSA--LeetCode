class Solution {
    // public static List<Integer> pascal(int rowIndex, int row, List<Integer> result) {
    //     if (row == rowIndex) {
    //         return result;
    //     }

    //     List<Integer> list = new ArrayList<>();

    //     list.add(1);
    //     for (int i = 0; i < result.size() - 1; i++) {
    //         list.add(result.get(i) + result.get(i + 1));
    //     }

    //     list.add(1);
    //     return pascal(rowIndex, row + 1, list);
    // }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();

        result.add(1);

        for(int i = 1; i <= rowIndex; i++){
            List<Integer> list = new ArrayList<>();

            list.add(1);
            for(int j = 1; j < result.size(); j++){
                list.add(result.get(j) + result.get(j - 1));
            }
            list.add(1);
            result = list;
        }
        return result;
        
    }
}