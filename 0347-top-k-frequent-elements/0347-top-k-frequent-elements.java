class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num , 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> map.get(a) - map.get(b));

        int size = 0;
        for(int num : map.keySet()){
            heap.add(num);
            size++;
            if(size > k){
                heap.poll();
                size++;
            }
        }

        int[] result = new int[k];
        int index = 0;
        while(!heap.isEmpty()){
            result[index++] = heap.poll();
        }

        return result;
        
    }
}