package programs.dsa.algorithms.greedy.dijkstrasAlgorithm;

import java.util.Arrays;

class DijkstraAlgorithm {
    public static void dijkstra(int[][] graph, int src) {
        int vertices = graph.length;
        int[] dist = new int[vertices];
        boolean[] visited = new boolean[vertices];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        for (int count = 0; count < vertices - 1; count++) {
            int u = minDistance(dist, visited);
            visited[u] = true;

            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v]) {
                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        printSolution(dist);
    }

    public static int minDistance(int[] dist, boolean[] visited) {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < dist.length; i++) {
            if (!visited[i] && dist[i] < min) {
                min = dist[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static void printSolution(int[] dist) {
        System.out.println("Vertex \tDistance from Source");
        for (int i = 0; i < dist.length; i++) {
            System.out.println(i + " \t" + dist[i]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
                {0, 10, 0, 0, 0, 0},
                {10, 0, 5, 0, 0, 0},
                {0, 5, 0, 20, 1, 0},
                {0, 0, 20, 0, 2, 10},
                {0, 0, 1, 2, 0, 3},
                {0, 0, 0, 10, 3, 0}
        };
        dijkstra(graph, 0);
    }
}
