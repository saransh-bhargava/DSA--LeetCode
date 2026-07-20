class Solution {
    public static void reverse(int[] arr, int i, int j){
        
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;

        int[] arr = new int[size];
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[idx++] = grid[i][j];
            }
        }

        k %= size;

        reverse(arr, 0, size - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, size - 1);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        

        for(int i = 0; i < size; i++){
            curr.add(arr[i]);
            if((i + 1) % m == 0){
                result.add(new ArrayList<>(curr));
                curr.clear();
            }
        }
        return result;
    }
}