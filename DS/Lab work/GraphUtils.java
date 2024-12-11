public class GraphUtils {
    private int V; // Number of vertices
    private int[][] adj; // Adjacency matrix

    // Constructor to initialize graph with V vertices
    public GraphUtils(int v) {
        V = v;
        adj = new int[v][v];
    }

    // Method to add an edge from vertex v to vertex w
    public void addEdge(int v, int w) {
        adj[v][w] = 1;
    }

    // Depth-First Search (DFS) starting from vertex v
    public void DFS(int v) {
        boolean[] visited = new boolean[V]; // To mark visited vertices
        DFSUtil(v, visited);
    }

    // Utility function for DFS traversal
    private void DFSUtil(int v, boolean[] visited) {
        visited[v] = true; // Mark current node as visited
        System.out.print(v + " "); // Print the current node

        // Recur for all the vertices adjacent to the current vertex
        for (int i = 0; i < V; i++) {
            if (adj[v][i] == 1 && !visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    // Breadth-First Search (BFS) starting from vertex s
    public void BFS(int s) {
        boolean[] visited = new boolean[V]; // To mark visited vertices
        int[] queue = new int[V]; // Queue to store the vertices for BFS
        int front = 0, rear = 0; // Front and rear pointers for the queue

        // Mark the starting vertex as visited and enqueue it
        visited[s] = true;
        queue[rear++] = s;

        while (front != rear) {
            // Dequeue a vertex from the queue and print it
            s = queue[front++];
            System.out.print(s + " ");

            // Get all adjacent vertices of the dequeued vertex s
            // If an adjacent vertex has not been visited, mark it visited and enqueue it
            for (int i = 0; i < V; i++) {
                if (adj[s][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    queue[rear++] = i;
                }
            }
        }
    }
}
