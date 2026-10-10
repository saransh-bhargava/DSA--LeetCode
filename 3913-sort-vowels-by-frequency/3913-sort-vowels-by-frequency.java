class Solution {
    public String sortVowels(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a, b) -> {
            int fa = a.getValue();
            int fb = b.getValue();

            if (fa == fb) {
                return Integer.compare(s.indexOf(a.getKey()), s.indexOf(b.getKey()));
            }
            return Integer.compare(fb, fa); // higher frequency first
        });

        heap.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();

        while (!heap.isEmpty()) {
            Map.Entry<Character, Integer> temp = heap.poll();
            char key = temp.getKey();
            int value = temp.getValue();

            for (int i = 0; i < value; i++) {
                sb.append(String.valueOf(key));
            }
        }

        StringBuilder result = new StringBuilder();
        int idx = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                result.append(String.valueOf(sb.charAt(idx++)));
            } else {
                result.append(String.valueOf(ch));
            }
        }
        return result.toString();
    }
}