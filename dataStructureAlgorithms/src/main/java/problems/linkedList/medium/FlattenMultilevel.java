package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Flatten a multilevel linked list
 *
 * Link: https://www.geeksforgeeks.org/flatten-a-linked-list-with-next-and-child-pointers/
 */
public class FlattenMultilevel {

    class MultilevelLL<T> {
        public T data;
        public MultilevelLL next;
        public MultilevelLL child;

        public MultilevelLL(T data) {
            this.data = data;
        }
    }

    public <T> MultilevelLL<T> make(MultilevelLL<T> head) {
        Queue<MultilevelLL<T>> queue = new LinkedList<>();
        queue.add(head);
        MultilevelLL<T> temp = null;
        while (!queue.isEmpty()) {
            if (temp != null) {
                temp.next = queue.peek();
            }
            temp = queue.poll();
            while (temp.next != null) {
                if (temp.child != null) {
                    queue.add(temp.child);
                    temp.child = null;
                }

                temp = temp.next;
            }
        }

        return head;
    }
}
