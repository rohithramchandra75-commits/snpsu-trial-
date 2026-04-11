package day14;

public class graph {
    int V;
    int[][] adjMatrix;

    graph(int V) {
        this.V = V;
        adjMatrix = new int[V][V];
    }

    // Fixed: Matches the 2-argument call in main
    void addEdge(int v, int w) {
        adjMatrix[v][w] = 1;
        adjMatrix[w][v] = 1;
    }

    void printAdjMatrix() {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Increased size to 5 to accommodate index 4
        graph g = new graph(5);
        g.addEdge(0, 1);
        g.addEdge(2, 1);
        g.addEdge(1, 4);
        g.printAdjMatrix();
    }
}