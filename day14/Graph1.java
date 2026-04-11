import java.util.ArrayList;

public class Graph1 {
    ArrayList<ArrayList<Integer>> adjList;

    // Fix 1: Constructor name must match the class name (Graph1, not Graph)
    Graph1(int vertices) {
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int w) {
        adjList.get(v).add(w);
        adjList.get(w).add(v);
    }

    void printAdjList() {
        for (int i = 0; i < adjList.size(); i++) {
            // Use print instead of println to keep the list on one line
            System.out.print(i + " -> ");
            for (int neighbour : adjList.get(i)) {
                System.out.print(neighbour + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Fix 2: Class name is Graph1, and Java is case-sensitive
        Graph1 g = new Graph1(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);

        // Fix 3: Method name must match (printAdjList, not printAdjMatrix)
        g.printAdjList();
    }
}