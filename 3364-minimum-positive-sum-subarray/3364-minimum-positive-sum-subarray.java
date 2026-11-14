class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n = nums.size();

        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + nums.get(i);
        }

        int minSum = Integer.MAX_VALUE;
        for (int i = l; i <= Math.min(n, r); i++) {
            for (int j = 0; j + i <= n; j++) {
                int sum = prefix[i + j] - prefix[j];
                if (sum > 0) {
                    minSum = Math.min(minSum, sum);
                }
            }
        }
        return (minSum == Integer.MAX_VALUE) ? -1 : minSum;
    }
}