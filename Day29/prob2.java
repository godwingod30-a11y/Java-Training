import java.util.*;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Create an adjacency list to represent the graph
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        // Array to track the in-degree of each course
        int[] inDegree = new int[numCourses];

        // Build the graph and populate in-degrees
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prerequisite = pre[1];
            adj.get(prerequisite).add(course);
            inDegree[course]++;
        }

        // Queue to store courses with 0 prerequisites (in-degree == 0)
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i);
            }
        }

        int coursesTaken = 0;

        // Process the courses
        while (!queue.isEmpty()) {
            int current = queue.poll();
            coursesTaken++;

            // For each dependent course, reduce its in-degree
            for (int neighbor : adj.get(current)) {
                inDegree[neighbor]--;
                // If it now has 0 prerequisites, add it to the queue
                if (inDegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // If we were able to take all courses, return true (no cycles)
        return coursesTaken == numCourses;
    }
}