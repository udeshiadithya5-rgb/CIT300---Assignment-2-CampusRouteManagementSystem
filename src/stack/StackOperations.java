package stack;

/**
 * StackOperations - LIFO operations using array
 * Owner: Maduranga (23DA2-0155)
 * Package: stack
 */
public class StackOperations {
    private final int MAX_SIZE = 5;
    private final String[] stack;
    private int top;

    public StackOperations() {
        stack = new String[MAX_SIZE];
        top = -1;
    }

    // Add an item to the top of the stack
    public void push(String item) {
        if (isFull()) {
            System.out.println("Stack Overflow! Stack is full.");
            return;
        }

        if (item == null || item.trim().isEmpty()) {
            System.out.println("Cannot push an empty item.");
            return;
        }

        stack[++top] = item;
        System.out.println("Pushed: " + item);
    }

    // Remove and return the top item
    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Stack is empty.");
            return null;
        }

        String item = stack[top];
        stack[top] = null;
        top--;

        System.out.println("Popped: " + item);
        return item;
    }

    // View the top item without removing it
    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Nothing to peek.");
            return null;
        }

        System.out.println("Top: " + stack[top]);  // <-- ADDED
        return stack[top];
    }

    // Display from top to bottom
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        System.out.println("\n--- STACK (TOP TO BOTTOM) ---");

        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public int size() {
        return top + 1;
    }
}