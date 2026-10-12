package array;

/**
 * ArrayOperations - Array CRUD operations (String-based)
 * Owner: Adithya (23DA2-0366)
 * Package: array
 */
public class ArrayOperations {
    private String[] arr;
    private int size;
    private int capacity;

    public ArrayOperations(int capacity) {
        this.capacity = capacity;
        this.arr = new String[capacity];
        this.size = 0;
    }

    public boolean insert(String value) {
        if (size >= capacity) {
            System.out.println("! Array is full!");
            return false;
        }
        if (value == null || value.trim().isEmpty()) {
            System.out.println("! Cannot insert empty value!");
            return false;
        }
        arr[size++] = value;
        System.out.println("OK Inserted '" + value + "' at index " + (size - 1));
        return true;
    }

    public boolean insertAt(int index, String value) {
        if (index < 0 || index > size) {
            System.out.println("! Invalid index!");
            return false;
        }
        if (size >= capacity) {
            System.out.println("! Array is full!");
            return false;
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = value;
        size++;
        System.out.println("OK Inserted '" + value + "' at index " + index);
        return true;
    }

    public boolean deleteAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("! Invalid index!");
            return false;
        }
        String removed = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
        System.out.println("OK Deleted '" + removed + "' from index " + index);
        return true;
    }

    public boolean deleteByValue(String value) {
        int index = search(value);
        if (index == -1) {
            System.out.println("! Value '" + value + "' not found!");
            return false;
        }
        return deleteAt(index);
    }

    public int search(String value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null && arr[i].equals(value)) return i;
        }
        return -1;
    }

    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Array: [");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]);
            if (i < size - 1) System.out.print(", ");
        }
        System.out.println("]  (size=" + size + ", capacity=" + capacity + ")");
    }

    public String[] getArray() { return arr; }
    public int getSize() { return size; }
    public int getCapacity() { return capacity; }
}