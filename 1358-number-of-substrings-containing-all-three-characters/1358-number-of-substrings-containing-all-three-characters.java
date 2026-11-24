class Solution {
    public int numberOfSubstrings(String s) {
        int[] arr = new int[3];
        int len = s.length(), left = 0, right = 0;
        int count = 0;
        while(right < len){
            arr[s.charAt(right) - 'a']++;

            while(hasAllthree(arr)){
                count += len - right;
                arr[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }
        
        return count;
    }

    public boolean hasAllthree(int[] arr){
        return arr[0] > 0 && arr[1] > 0 && arr[2] > 0;
    }
}