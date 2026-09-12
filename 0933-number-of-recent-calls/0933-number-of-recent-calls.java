class RecentCounter {

    
    Queue<Integer> count;
    public RecentCounter() {
        
        this.count = new LinkedList<>();
    }
    
    public int ping(int t) {
        count.add(t);
        while(!count.isEmpty() && count.peek() < t - 3000){
            count.poll();
        }

        return count.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */