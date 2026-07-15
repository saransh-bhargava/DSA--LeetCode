class Solution {
    
    public int gcdOfOddEvenSums(int n) {
        int oddSum = n * n;
        int evenSum = n * (n + 1);

        int minSum = Math.min(oddSum , evenSum);
        int maxSum = Math.max(oddSum , evenSum);

        if(maxSum % minSum == 0){
            return minSum;
        }

        int result = 1;
        for(int i = minSum / 2; i >= 1 ; i--){
            if(minSum % i == 0 && maxSum % i == 0){
                result = i;
                break;
            }
        }
        return result;
    }
}