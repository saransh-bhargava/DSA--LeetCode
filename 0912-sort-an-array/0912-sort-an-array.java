class Solution {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int start, int end) {
        Random random = new Random();
        int randomIndex = start + random.nextInt(end - start + 1);
        swap(arr, randomIndex, end);

        int pivot = arr[end];
        int pIndex = start;

        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                swap(arr, pIndex, i);
                pIndex++;
            }
        }
        swap(arr, end, pIndex);
        return pIndex;
    }

    public static void quickSort(int[] arr, int start, int end) {
    if (start >= end) return;

    Random random = new Random();
    int randomIndex = start + random.nextInt(end - start + 1);
    swap(arr, randomIndex, end);
    int pivot = arr[end];

    int lt = start, gt = end, i = start;
    while (i <= gt) {
        if (arr[i] < pivot) {
            swap(arr, i, lt);
            lt++;
            i++;
        } else if (arr[i] > pivot) {
            swap(arr, i, gt);
            gt--;
            
        } else {
            i++;
        }
    }

    quickSort(arr, start, lt - 1);
    quickSort(arr, gt + 1, end);
}

    public int[] sortArray(int[] nums) {
        int n = nums.length;
        quickSort(nums, 0, n - 1);
        return nums;
    }
}