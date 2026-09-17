import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        int n = s.length();

        Queue<Integer> queue = new LinkedList<>();
        int[] freqArray = new int[26];

        for (int i = 0; i < n; i++) {
            queue.offer(i);
            freqArray[s.charAt(i) - 'a']++;
        }

        while (queue.size() != 0) {
            if (freqArray[s.charAt(queue.peek())- 'a'] > 1) {
                queue.poll();
            } else {
                break;
            }
        }
        
        return queue.isEmpty() ? -1 : queue.peek();
    }
}