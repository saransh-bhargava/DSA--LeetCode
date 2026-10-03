class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        //step1
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numCourses; i++) {
            list.add(new ArrayList<>());
        }

        //step2
        int[] indegree = new int[numCourses];

        for (int[] prereq : prerequisites) {
            int course = prereq[0];
            int prereqCourse = prereq[1];
            list.get(prereqCourse).add(course);
            indegree[course]++;
        }

        //step3
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        int processCourses = 0;
        while (!queue.isEmpty()) {
            int current = queue.poll();
            processCourses++;
            for (int neighbour : list.get(current)) {
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) {
                    queue.add(neighbour);
                }
            }
        }
        return processCourses == numCourses;
    }
}