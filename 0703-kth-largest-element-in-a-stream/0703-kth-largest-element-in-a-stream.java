class KthLargest {
     PriorityQueue<Integer> heap = new PriorityQueue<>();
     int size;
    public KthLargest(int k, int[] nums) {
        size = k;
        for(int num : nums){
            add(num);
        }
    }
    
    public int add(int val) {
        heap.add(val);
        if(heap.size() > size){
            heap.poll();
        }
        return heap.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */