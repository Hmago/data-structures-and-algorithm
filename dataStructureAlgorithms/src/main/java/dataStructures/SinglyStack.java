package dataStructures;

public class SinglyStack<T> {

    private SinglyLinkedList<T> head;

    int maxSize = 0;
    int currentSize = 0;

    public SinglyStack(int maxSize) {
        this.maxSize = maxSize;
    }

    public SinglyLinkedList<T> getHeadNode() {
        return head;
    }

    public T getHead() {
        return head.data;
    }

    public T push(T data) {
        if (currentSize > maxSize) {
            System.out.println("Stack Overflow");
            return null;
        }
        /* Adding data into the stack */
        SinglyLinkedList<T> newNode = new SinglyLinkedList<>(data);
        newNode.next = head;
        head = newNode;
        currentSize++;

        return data;
    }

    public T pop() {
        if (currentSize < 1) {
            System.out.println("stack is empty");
            return null;
        }
        /* Removing from the main stack */
        T data = head.data;
        head = head.next;

        return data;
    }

    public int size() {
        return this.currentSize;
    }

    public boolean isEmpty() {
        if (currentSize < 1) {
            return true;
        }

        return false;
    }
}
