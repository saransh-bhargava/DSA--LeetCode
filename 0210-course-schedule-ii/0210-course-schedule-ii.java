class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> list = new ArrayList<>();

        for(int i = 0; i < numCourses; i++){
            list.add(new ArrayList<>());
        }

        int[] indegree = new int[numCourses];

        for(int[] preq : prerequisites){
            int course = preq[0];
            int preqCoure = preq[1];
            list.get(preqCoure).add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0){
                queue.add(i);
            }
        }

        int[] result = new int[numCourses];
        int processCourses = 0;

        while(!queue.isEmpty()){
            int current = queue.poll();
            result[processCourses++] = current;

            for(int neighbour : list.get(current)){
                indegree[neighbour]--;
                if(indegree[neighbour] == 0){
                    queue.add(neighbour);
                }
            }
        }
        if(processCourses == numCourses) return result;
        return new int[]{};
    }
}