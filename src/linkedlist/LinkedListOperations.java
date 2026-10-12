package linkedlist;

/**
 * LinkedListOperations - Singly Linked List (String-based)
 * Owner: Sandakelum (23DA2-0216)
 * Package: linkedlist
 */
public class LinkedListOperations {
    class Node {
        String data;
        Node next;
        Node(String data) { this.data = data; this.next = null; }
    }

    private Node head;
    private int size;

    public LinkedListOperations() {
        head = null;
        size = 0;
    }

    public void insertAtBeginning(String value) {
        if (value == null || value.trim().isEmpty()) {
            System.out.println("! Cannot insert empty value!");
            return;
        }
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        size++;
        System.out.println("OK Inserted '" + value + "' at beginning");
    }

    public void insertAtEnd(String value) {
        if (value == null || value.trim().isEmpty()) {
            System.out.println("! Cannot insert empty value!");
            return;
        }
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) curr = curr.next;
            curr.next = newNode;
        }
        size++;
        System.out.println("OK Inserted '" + value + "' at end");
    }

    public void insertAtPosition(int pos, String value) {
        if (pos < 0 || pos > size) {
            System.out.println("! Invalid position!");
            return;
        }
        if (pos == 0) { insertAtBeginning(value); return; }
        Node newNode = new Node(value);
        Node curr = head;
        for (int i = 0; i < pos - 1; i++) curr = curr.next;
        newNode.next = curr.next;
        curr.next = newNode;
        size++;
        System.out.println("OK Inserted '" + value + "' at position " + pos);
    }

    public void deleteByValue(String value) {
        if (head == null) {
            System.out.println("! List is empty!");
            return;
        }
        if (head.data.equals(value)) {
            head = head.next;
            size--;
            System.out.println("OK Deleted '" + value + "'");
            return;
        }
        Node curr = head;
        while (curr.next != null && !curr.next.data.equals(value)) curr = curr.next;
        if (curr.next == null) {
            System.out.println("! Value '" + value + "' not found!");
            return;
        }
        curr.next = curr.next.next;
        size--;
        System.out.println("OK Deleted '" + value + "'");
    }

    public boolean search(String value) {
        Node curr = head;
        int pos = 0;
        while (curr != null) {
            if (curr.data.equals(value)) {
                System.out.println("OK Found '" + value + "' at position " + pos);
                return true;
            }
            curr = curr.next;
            pos++;
        }
        System.out.println("X Value '" + value + "' not found");
        return false;
    }

    public void display() {
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }
        System.out.print("Linked List: ");
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + (curr.next != null ? " -> " : ""));
            curr = curr.next;
        }
        System.out.println("  (size=" + size + ")");
    }

    public int getSize() { return size; }
}