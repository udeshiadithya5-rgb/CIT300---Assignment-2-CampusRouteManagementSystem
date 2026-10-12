package graph;

import java.util.*;

/**
 * GraphOperations - Adjacency List graph with BFS/DFS
 * Owner: Manodhya (23DA2-0255)
 * Package: graph
 */
public class GraphOperations {
    private Map<String, List<String>> adjList;

    public GraphOperations() {
        adjList = new LinkedHashMap<>();
    }

    public void addVertex(String vertex) {
        if (adjList.containsKey(vertex)) {
            System.out.println("! Vertex '" + vertex + "' already exists!");
            return;
        }
        adjList.put(vertex, new ArrayList<>());
        System.out.println("OK Vertex '" + vertex + "' added");
    }

    public void addEdge(String src, String dest) {
        if (!adjList.containsKey(src) || !adjList.containsKey(dest)) {
            System.out.println("! Both vertices must exist first!");
            return;
        }
        adjList.get(src).add(dest);
        adjList.get(dest).add(src);
        System.out.println("OK Edge added: " + src + " <-> " + dest);
    }

    public void displayGraph() {
        if (adjList.isEmpty()) {
            System.out.println("Graph is empty.");
            return;
        }
        System.out.println("\n=== Graph (Adjacency List) ===");
        for (Map.Entry<String, List<String>> e : adjList.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }

    public void bfs(String start) {
        if (!adjList.containsKey(start)) {
            System.out.println("! Start vertex not found!");
            return;
        }
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        System.out.print("BFS from " + start + ": ");
        int steps = 0;
        while (!queue.isEmpty()) {
            String curr = queue.poll();
            System.out.print(curr + " ");
            steps++;
            for (String neighbor : adjList.get(curr)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
        System.out.println("\nSteps: " + steps + " | Complexity: O(V+E)");
    }

    public void dfs(String start) {
        if (!adjList.containsKey(start)) {
            System.out.println("! Start vertex not found!");
            return;
        }
        Set<String> visited = new HashSet<>();
        System.out.print("DFS from " + start + ": ");
        int[] steps = {0};
        dfsRecursive(start, visited, steps);
        System.out.println("\nSteps: " + steps[0] + " | Complexity: O(V+E)");
    }

    private void dfsRecursive(String vertex, Set<String> visited, int[] steps) {
        visited.add(vertex);
        System.out.print(vertex + " ");
        steps[0]++;
        for (String neighbor : adjList.get(vertex)) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited, steps);
            }
        }
    }

    public void findPath(String start, String end) {
        if (!adjList.containsKey(start) || !adjList.containsKey(end)) {
            System.out.println("! Vertex not found!");
            return;
        }
        Map<String, String> parent = new HashMap<>();
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            if (curr.equals(end)) break;
            for (String n : adjList.get(curr)) {
                if (!visited.contains(n)) {
                    visited.add(n);
                    parent.put(n, curr);
                    queue.add(n);
                }
            }
        }

        if (!parent.containsKey(end) && !start.equals(end)) {
            System.out.println("No path found from " + start + " to " + end);
            return;
        }

        List<String> path = new ArrayList<>();
        String curr = end;
        while (curr != null) {
            path.add(0, curr);
            curr = parent.get(curr);
        }
        System.out.println("Path: " + String.join(" -> ", path));
    }

    public Map<String, List<String>> getAdjList() { return adjList; }
}