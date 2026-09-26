import java.util.*;

class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : stones){
            heap.add(num);
        }

        while(heap.size() > 1){
            int x = heap.poll();
            int y = heap.poll();
            if(x == y) continue;
            else heap.add(x - y);
        }
        if(heap.size() == 0) return 0;
        return heap.peek();
    }
}