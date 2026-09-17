class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;

        int time = 0;
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()){
            time++;
            int front = queue.poll();
            tickets[front]--;
            if (tickets[front] != 0) {
                queue.offer(front);
            } else {
                if (front == k) {
                    return time;
                }
            }

        }

        return time;
    }
}