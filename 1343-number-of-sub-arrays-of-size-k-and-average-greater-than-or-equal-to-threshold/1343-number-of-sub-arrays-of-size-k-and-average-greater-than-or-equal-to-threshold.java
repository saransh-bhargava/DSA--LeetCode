class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int n = arr.length;
        int windowSum = 0;
        for(int i = 0; i < k ; i++){
            windowSum += arr[i];
        }

        int windowAverage = windowSum / k ;
        int count = windowAverage >= threshold ? 1 : 0;
        for(int i = k; i < n; i++){
            windowSum  += arr[i];
            windowSum  -= arr[i - k];
            if((windowSum / k) >= threshold) {
                count++;
            }

        }
        return count;
    }
}