package dataStructures;

/*
 * Doubly Linked List Node
 */
public class DoublyLinkedList<T> {
    public T data;
    public DoublyLinkedList<T> next;
    public DoublyLinkedList<T> prev;

    public DoublyLinkedList(T data) {
        this.data = data;
        next = null;
        prev = null;
    }

    public static <T> DoublyLinkedList<T> createNode(T data) {
        return new DoublyLinkedList<>(data);
    }

    @Override
    public String toString() {
        return "DoublyLinkedList{" +
                "data=" + data +
                '}';
    }
}
