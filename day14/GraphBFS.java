package day14;

import java.util.*;

public class GraphBFS {
    int V;

    // Constructor
    GraphBFS(int V) {
        this.V = V;
    }

    // BFS Traversal Method
    public ArrayList<Integer> bfsTraversal(ArrayList<ArrayList<Integer>> adjList, int startNode) {
        ArrayList<Integer> result = new ArrayList<>();
        // size V + 1 to handle 1-based indexing safely
        boolean[] visited = new boolean[adjList.size()];
        Queue<Integer> q = new LinkedList<>();

        visited[startNode] = true;
        q.add(startNode);

        while (!q.isEmpty()) {
            int curr = q.poll();
            result.add(curr);

            // Get neighbors of the current node
            for (int neighbor : adjList.get(curr)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
        return result;
    }

    // DFS Traversal Method (Recursive)
    public void dfs(int node, ArrayList<ArrayList<Integer>> adjList, boolean[] visited, ArrayList<Integer> result) {
        visited[node] = true;
        result.add(node);

        for (int neighbor : adjList.get(node)) {
            if (!visited[neighbor]) {
                dfs(neighbor, adjList, visited, result);
            }
        }
    }
}

class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices (V): ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges (E): ");
        int E = sc.nextInt();

        // Initialize adjacency list for V+1 to avoid IndexOutOfBounds
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            adjList.add(new ArrayList<>());
        }

        System.out.println("Enter edges (format: u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            // Check to prevent out of bounds if user enters node > V
            if (u <= V && v <= V) {
                adjList.get(u).add(v);
                adjList.get(v).add(u); // Remove this for a Directed Graph
            } else {
                System.out.println("Error: Node index " + (u > V ? u : v) + " exceeds V=" + V);
            }
        }

        System.out.print("Enter starting node for traversal: ");
        int start = sc.nextInt();

        GraphBFS graphObj = new GraphBFS(V);

        // Perform BFS
        ArrayList<Integer> bfsAns = graphObj.bfsTraversal(adjList, start);
        System.out.println("\nBFS Traversal: " + bfsAns);

        // Perform DFS
        ArrayList<Integer> dfsAns = new ArrayList<>();
        boolean[] visitedDFS = new boolean[V + 1];
        graphObj.dfs(start, adjList, visitedDFS, dfsAns);
        System.out.println("DFS Traversal: " + dfsAns);

        sc.close();
    }
}