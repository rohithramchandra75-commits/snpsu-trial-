package day14;

import java.util.*;

class GraphTraversal {
    private Map<String, List<String>> adjList = new HashMap<>();

    // Helper to add edges
    public void addEdge(String u, String v) {
        adjList.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
        adjList.computeIfAbsent(v, k -> new ArrayList<>()); // Ensure leaf nodes exist
    }

    // Breadth-First Search
    public void bfs(String startNode) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        visited.add(startNode);
        queue.add(startNode);

        System.out.print("BFS Traversal: ");
        while (!queue.isEmpty()) {
            String node = queue.poll();
            System.out.print(node + " ");

            for (String neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println();
    }

    // Depth-First Search (Recursive)
    public void dfs(String startNode) {
        Set<String> visited = new HashSet<>();
        System.out.print("DFS Traversal: ");
        dfsHelper(startNode, visited);
        System.out.println();
    }

    private void dfsHelper(String node, Set<String> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (String neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsHelper(neighbor, visited);
            }
        }
    }

    public static void main(String[] args) {
        GraphTraversal graph = new GraphTraversal();
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("B", "E");
        graph.addEdge("C", "F");

        graph.bfs("A"); // Output: A B C D E F
        graph.dfs("A"); // Output: A B D E C F
    }
}