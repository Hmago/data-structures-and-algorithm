package dataStructures;

/*
 * Singly linked list node
 */
public class SinglyLinkedList<T> {
    public T data;
    public SinglyLinkedList<T> next;

    public SinglyLinkedList(T data) {
        this.data = data;
        next = null;
    }

    public static <T> SinglyLinkedList<T> createNode(T data) {
        return new SinglyLinkedList<>(data);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + data.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof SinglyLinkedList)) {
            return false;
        }

        return this.data.equals(((SinglyLinkedList) obj).data);
    }

    @Override
    public String toString() {
        return "SinglyLinkedList{" +
                "data=" + data +
                '}';
    }
}
