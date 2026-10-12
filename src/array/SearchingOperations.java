package array;

import java.util.Arrays;

/**
 * SearchingOperations - Linear vs Binary Search (String-based)
 * Owner: Adithya (23DA2-0366)
 * Package: array
 */
public class SearchingOperations {

    public static int linearSearch(String[] arr, int size, String target) {
        int steps = 0;
        for (int i = 0; i < size; i++) {
            steps++;
            if (arr[i] != null && arr[i].equals(target)) {
                System.out.println("OK Linear Search: Found at index " + i + " | Steps: " + steps);
                return i;
            }
        }
        System.out.println("X Linear Search: Not found | Steps: " + steps);
        return -1;
    }

    public static int binarySearch(String[] arr, int size, String target) {
        // Create a sorted copy of non-null strings
        String[] sorted = new String[size];
        int validCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] != null) sorted[validCount++] = arr[i];
        }
        Arrays.sort(sorted, 0, validCount);

        int low = 0, high = validCount - 1;
        int steps = 0;

        while (low <= high) {
            steps++;
            int mid = (low + high) / 2;
            int cmp = sorted[mid].compareTo(target);
            if (cmp == 0) {
                System.out.println("OK Binary Search: Found at sorted index " + mid + " | Steps: " + steps);
                return mid;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("X Binary Search: Not found | Steps: " + steps);
        return -1;
    }

    public static void compareSearch(String[] arr, int size, String target) {
        System.out.println("\n=== SEARCH COMPARISON for target = '" + target + "' ===");
        long start = System.nanoTime();
        linearSearch(arr, size, target);
        long linearTime = System.nanoTime() - start;

        start = System.nanoTime();
        binarySearch(arr, size, target);
        long binaryTime = System.nanoTime() - start;

        System.out.println("\nTime (Linear): " + linearTime + " ns");
        System.out.println("Time (Binary): " + binaryTime + " ns");
        System.out.println("Linear: O(n)  |  Binary: O(log n)");
    }
}