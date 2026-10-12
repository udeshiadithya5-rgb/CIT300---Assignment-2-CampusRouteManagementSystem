package queue;

/**
 * QueueOperations - FIFO operations using circular array
 * Owner: Maduranga (23DA2-0155)
 * Package: queue
 */
public class QueueOperations {
    private final int MAX_SIZE = 5;
    private final String[] queue;

    private int front;
    private int rear;
    private int count;

    public QueueOperations() {
        queue = new String[MAX_SIZE];
        front = 0;
        rear = -1;
        count = 0;
    }

    // Add an item to the rear
    public void enqueue(String item) {
        if (isFull()) {
            System.out.println("Queue Overflow! Queue is full.");
            return;
        }

        if (item == null || item.trim().isEmpty()) {
            System.out.println("Cannot enqueue an empty item.");
            return;
        }

        rear = (rear + 1) % MAX_SIZE;
        queue[rear] = item;
        count++;

        System.out.println("Enqueued: " + item);
    }

    // Remove and return the front item
    public String dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Queue is empty.");
            return null;
        }

        String item = queue[front];
        queue[front] = null;
        front = (front + 1) % MAX_SIZE;
        count--;

        if (count == 0) {
            front = 0;
            rear = -1;
        }

        System.out.println("Dequeued: " + item);
        return item;
    }

    // View the front item without removing it
    public String peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return null;
        }

        System.out.println("Front: " + queue[front]);
        return queue[front];
    }

    // Display from front to rear
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        System.out.println("\n--- QUEUE (FRONT TO REAR) ---");

        for (int i = 0; i < count; i++) {
            int index = (front + i) % MAX_SIZE;
            System.out.println(queue[index]);
        }
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == MAX_SIZE;
    }

    public int size() {
        return count;
    }
}