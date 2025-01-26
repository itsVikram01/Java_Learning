package java.dsa.algorithms.greedy.bellmanFordAlgorithm;

import java.util.Arrays;

class BellmanFord {
    public static void bellmanFord(int vertices, int[][] edges, int source) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[source] = 0;

        for (int i = 1; i < vertices; i++) {
            for (int[] edge : edges) {
                int u = edge[0], v = edge[1], weight = edge[2];
                if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
                    distance[v] = distance[u] + weight;
                }
            }
        }

        for (int[] edge : edges) {
            int u = edge[0], v = edge[1], weight = edge[2];
            if (distance[u] != Integer.MAX_VALUE && distance[u] + weight < distance[v]) {
                System.out.println("Graph contains a negative weight cycle.");
                return;
            }
        }

        System.out.println("Vertex distances from source:");
        for (int i = 0; i < vertices; i++) {
            System.out.println(i + ": " + distance[i]);
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        int[][] edges = {
                {0, 1, -1}, {0, 2, 4},
                {1, 2, 3}, {1, 3, 2}, {1, 4, 2},
                {3, 2, 5}, {3, 1, 1}, {4, 3, -3}
        };
        bellmanFord(vertices, edges, 0);
    }
}
