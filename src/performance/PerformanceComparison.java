package performance;

import array.SearchingOperations;
import stack.StackOperations;
import queue.QueueOperations;
import linkedlist.LinkedListOperations;

/**
 * PerformanceComparison - Benchmarks all data structures
 * Owner: Sandakelum (23DA2-0216)
 * Package: performance
 */
public class PerformanceComparison {

    public static void compareAllStructures() {
        System.out.println("\n=== PERFORMANCE COMPARISON ===");

        // ---- Stack push benchmark (max 5 items) ----
        long start = System.nanoTime();
        StackOperations stack = new StackOperations();
        for (int i = 0; i < 5; i++) stack.push("StackItem-" + i);
        long stackPush = System.nanoTime() - start;

        // ---- Queue enqueue benchmark (max 5 items) ----
        start = System.nanoTime();
        QueueOperations queue = new QueueOperations();
        for (int i = 0; i < 5; i++) queue.enqueue("QueueItem-" + i);
        long queueEnqueue = System.nanoTime() - start;

        // ---- Linked List insert benchmark ----
        int N = 1000;
        start = System.nanoTime();
        LinkedListOperations list = new LinkedListOperations();
        for (int i = 0; i < N; i++) list.insertAtEnd("ListItem-" + i);
        long listInsert = System.nanoTime() - start;

        // ---- Array insert benchmark ----
        start = System.nanoTime();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) arr[i] = "ArrayItem-" + i;
        long arrayInsert = System.nanoTime() - start;

        System.out.println("\n--- Insertion Times ---");
        System.out.printf("Array insert (n=%d)      : %d ns  | O(1)\n", N, arrayInsert);
        System.out.printf("Linked List insert (n=%d): %d ns  | O(n)\n", N, listInsert);
        System.out.printf("Stack push (max=5)       : %d ns  | O(1)\n", stackPush);
        System.out.printf("Queue enqueue (max=5)    : %d ns  | O(1)\n", queueEnqueue);

        // ---- Search comparison using String array ----
        System.out.println("\n--- Search Times (n=" + N + ") ---");
        start = System.nanoTime();
        SearchingOperations.linearSearch(arr, N, "ArrayItem-" + (N - 1));
        System.out.println("Linear Search time: " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        SearchingOperations.binarySearch(arr, N, "ArrayItem-" + (N - 1));
        System.out.println("Binary Search time: " + (System.nanoTime() - start) + " ns");
    }

    public static void generateReport() {
        System.out.println("\n+------------------+----------------+-----------+");
        System.out.println("| Operation        | Algorithm      | Complexity|");
        System.out.println("+------------------+----------------+-----------+");
        System.out.println("| Array Insert     | End insert     | O(1)      |");
        System.out.println("| Array Delete     | Shift delete   | O(n)      |");
        System.out.println("| Linear Search    | Sequential     | O(n)      |");
        System.out.println("| Binary Search    | Divide/Conquer | O(log n)  |");
        System.out.println("| Stack Push/Pop   | LIFO           | O(1)      |");
        System.out.println("| Queue Enq/Deq    | FIFO           | O(1)      |");
        System.out.println("| LinkedList Insert| Traverse       | O(n)      |");
        System.out.println("| BFS Traversal    | Queue-based    | O(V+E)    |");
        System.out.println("| DFS Traversal    | Stack-based    | O(V+E)    |");
        System.out.println("+------------------+----------------+-----------+");
    }
}