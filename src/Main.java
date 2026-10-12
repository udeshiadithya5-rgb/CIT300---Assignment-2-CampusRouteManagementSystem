import array.ArrayOperations;
import array.SearchingOperations;
import stack.StackOperations;
import queue.QueueOperations;
import linkedlist.LinkedListOperations;
import graph.GraphOperations;
import performance.PerformanceComparison;
import util.InputValidator;

/**
 * Main - Integrated console application
 * Owner: Adithya (23DA2-0366) - Leader / Integration
 * Project: Campus Route Management System
 * Course: CIT300 - Graded Practical Assignment 2
 */
public class Main {

    private static ArrayOperations arrayOps = new ArrayOperations(100);
    private static StackOperations stackOps = new StackOperations();
    private static QueueOperations queueOps = new QueueOperations();
    private static LinkedListOperations listOps = new LinkedListOperations();
    private static GraphOperations graphOps = new GraphOperations();

    public static void main(String[] args) {
        // ===== HEADER 1: Project Title =====
        System.out.println("==========================================");
        System.out.println("   CAMPUS ROUTE MANAGEMENT SYSTEM");
        System.out.println("   CIT300 - Graded Practical Assignment 2");
        System.out.println("==========================================");

        // ===== SEPARATOR =====
        System.out.println();

        // ===== HEADER 2: Application Title =====
        System.out.println("==========================================");
        System.out.println("   DATA STRUCTURE & GRAPH ANALYZER");
        System.out.println("==========================================");

        // ===== MAIN LOOP =====
        while (true) {
            printMainMenu();
            int choice = InputValidator.getIntInput("Enter your choice: ", 1, 9);

            switch (choice) {
                case 1: arrayMenu(); break;
                case 2: stackMenu(); break;
                case 3: queueMenu(); break;
                case 4: linkedListMenu(); break;
                case 5: searchingMenu(); break;
                case 6: graphMenu(); break;
                case 7: PerformanceComparison.compareAllStructures(); break;
                case 8: PerformanceComparison.generateReport(); break;
                case 9:
                    System.out.println("Exiting... Thank you!");
                    return;
            }
        }
    }

    // ============================================================
    //                       MAIN MENU
    // ============================================================
    private static void printMainMenu() {
        System.out.println("\n--- MAIN MENU ---");
        System.out.println("1. Array Operations");
        System.out.println("2. Stack Operations");
        System.out.println("3. Queue Operations");
        System.out.println("4. Linked List Operations");
        System.out.println("5. Searching Operations");
        System.out.println("6. Graph Operations");
        System.out.println("7. Performance Comparison");
        System.out.println("8. Display All Results");
        System.out.println("9. Exit");
    }

    // ============================================================
    //                     ARRAY MENU
    // ============================================================
    private static void arrayMenu() {
        while (true) {
            System.out.println("\n--- ARRAY OPERATIONS ---");
            System.out.println("1. Insert at end");
            System.out.println("2. Insert at index");
            System.out.println("3. Delete at index");
            System.out.println("4. Delete by value");
            System.out.println("5. Search");
            System.out.println("6. Display");
            System.out.println("7. Return to Main Menu");
            int c = InputValidator.getIntInput("Choice: ", 1, 7);
            if (c == 7) return;

            switch (c) {
                case 1:
                    arrayOps.insert(InputValidator.getStringInput("Enter item: "));
                    break;
                case 2:
                    int idx = InputValidator.getIntInput("Enter index: ");
                    String val = InputValidator.getStringInput("Enter item: ");
                    arrayOps.insertAt(idx, val);
                    break;
                case 3:
                    arrayOps.deleteAt(InputValidator.getIntInput("Enter index: "));
                    break;
                case 4:
                    arrayOps.deleteByValue(InputValidator.getStringInput("Enter item: "));
                    break;
                case 5:
                    int s = arrayOps.search(InputValidator.getStringInput("Enter item: "));
                    System.out.println(s == -1 ? "Not found" : "Found at index " + s);
                    break;
                case 6:
                    arrayOps.display();
                    break;
            }
        }
    }

    // ============================================================
    //                     STACK MENU
    // ============================================================
    private static void stackMenu() {
        while (true) {
            System.out.println("\n--- STACK OPERATIONS ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            int c = InputValidator.getIntInput("Choice: ", 1, 5);
            if (c == 5) return;
            switch (c) {
                case 1: stackOps.push(InputValidator.getStringInput("Enter item: ")); break;
                case 2: stackOps.pop(); break;
                case 3: stackOps.peek(); break;
                case 4: stackOps.display(); break;
            }
        }
    }

    // ============================================================
    //                     QUEUE MENU
    // ============================================================
    private static void queueMenu() {
        while (true) {
            System.out.println("\n--- QUEUE OPERATIONS ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Return to Main Menu");
            int c = InputValidator.getIntInput("Choice: ", 1, 5);
            if (c == 5) return;
            switch (c) {
                case 1: queueOps.enqueue(InputValidator.getStringInput("Enter item: ")); break;
                case 2: queueOps.dequeue(); break;
                case 3: queueOps.peek(); break;
                case 4: queueOps.display(); break;
            }
        }
    }

    // ============================================================
    //                  LINKED LIST MENU
    // ============================================================
    private static void linkedListMenu() {
        while (true) {
            System.out.println("\n--- LINKED LIST OPERATIONS ---");
            System.out.println("1. Insert at beginning");
            System.out.println("2. Insert at end");
            System.out.println("3. Insert at position");
            System.out.println("4. Delete by value");
            System.out.println("5. Search");
            System.out.println("6. Display");
            System.out.println("7. Return to Main Menu");
            int c = InputValidator.getIntInput("Choice: ", 1, 7);
            if (c == 7) return;
            switch (c) {
                case 1: listOps.insertAtBeginning(InputValidator.getStringInput("Enter item: ")); break;
                case 2: listOps.insertAtEnd(InputValidator.getStringInput("Enter item: ")); break;
                case 3:
                    int p = InputValidator.getIntInput("Enter position: ");
                    String v = InputValidator.getStringInput("Enter item: ");
                    listOps.insertAtPosition(p, v);
                    break;
                case 4: listOps.deleteByValue(InputValidator.getStringInput("Enter item: ")); break;
                case 5: listOps.search(InputValidator.getStringInput("Enter item: ")); break;
                case 6: listOps.display(); break;
            }
        }
    }

    // ============================================================
    //                   SEARCHING MENU
    // ============================================================
    private static void searchingMenu() {
        System.out.println("\n--- SEARCHING OPERATIONS ---");
        arrayOps.display();
        if (arrayOps.getSize() == 0) {
            System.out.println("! Array is empty! Add elements first.");
            return;
        }
        String target = InputValidator.getStringInput("Enter target item: ");
        SearchingOperations.compareSearch(arrayOps.getArray(), arrayOps.getSize(), target);
    }

    // ============================================================
    //                     GRAPH MENU
    // ============================================================
    private static void graphMenu() {
        while (true) {
            System.out.println("\n--- GRAPH OPERATIONS ---");
            System.out.println("1. Add Vertex");
            System.out.println("2. Add Edge");
            System.out.println("3. Display Graph");
            System.out.println("4. BFS Traversal");
            System.out.println("5. DFS Traversal");
            System.out.println("6. Find Path");
            System.out.println("7. Return to Main Menu");
            int c = InputValidator.getIntInput("Choice: ", 1, 7);
            if (c == 7) return;
            switch (c) {
                case 1: graphOps.addVertex(InputValidator.getStringInput("Vertex name: ")); break;
                case 2:
                    String s = InputValidator.getStringInput("Source: ");
                    String d = InputValidator.getStringInput("Destination: ");
                    graphOps.addEdge(s, d);
                    break;
                case 3: graphOps.displayGraph(); break;
                case 4: graphOps.bfs(InputValidator.getStringInput("Start vertex: ")); break;
                case 5: graphOps.dfs(InputValidator.getStringInput("Start vertex: ")); break;
                case 6:
                    String a = InputValidator.getStringInput("Start: ");
                    String b = InputValidator.getStringInput("End: ");
                    graphOps.findPath(a, b);
                    break;
            }
        }
    }
}