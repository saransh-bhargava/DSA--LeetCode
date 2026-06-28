class Solution {
    public void duplicateZeros(int[] arr) {
        List<Integer> list = new ArrayList<>();

        for(int value : arr){
            if(value == 0){
                list.add(0);
            }
            list.add(value);
        }

        for(int i = 0; i < arr.length; i++){
            arr[i] = list.get(i);
        }
        
    }
}