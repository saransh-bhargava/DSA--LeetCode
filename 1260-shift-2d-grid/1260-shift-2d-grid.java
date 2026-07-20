class Solution {
    public static void reverse(int[] arr, int left, int right){
        
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
    }

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int n = grid.length;
        int m = grid[0].length;

        int[] arr = new int[n * m];
        int idx = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                arr[idx++] = grid[i][j];
                
            }
        }

        k = k % (n * m) ;

        reverse(arr, 0, (n * m) - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, (n * m) - 1);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        

        for(int i = 0; i < arr.length; i++){
            curr.add(arr[i]);
            if((i + 1) % m == 0){
                result.add(new ArrayList<>(curr));
                curr.clear();
            }
        }
        return result;
    }
}