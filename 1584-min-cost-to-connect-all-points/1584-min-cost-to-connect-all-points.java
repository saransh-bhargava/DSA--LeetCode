class Solution {
    public int prims(int[][] graph) {
        int n = graph.length;
        int m = graph[0].length;

        int[] key = new int[n];
        int[] parent = new int[n];
        boolean[] visited = new boolean[n];

        Arrays.fill(key, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);
        key[0] = 0;

        for (int i = 0; i < n; i++) {
            int minIdx = primsMin(key, visited);
            visited[minIdx] = true;
            for (int j = 0; j < n; j++) {
                if (graph[minIdx][j] != 0 && !visited[j] && graph[minIdx][j] < key[j]) {
                    key[j] = graph[minIdx][j];
                    parent[j] = minIdx;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < key.length; i++) {
            sum += key[i];
        }
        return sum;
    }

    public int primsMin(int[] key, boolean[] visited) {
        int smallIdx = 0;
        int minKey = Integer.MAX_VALUE;

        for (int i = 0; i < key.length; i++) {
            if (!visited[i] && key[i] < minKey) {
                minKey = key[i];
                smallIdx = i;
            }
        }
        return smallIdx;
    }

    public int minCostConnectPoints(int[][] points) {
        int n = points.length;
        int[][] graph = new int[n][n];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n ;j++){
                graph[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
            }
        }
        return prims(graph);
    }
}