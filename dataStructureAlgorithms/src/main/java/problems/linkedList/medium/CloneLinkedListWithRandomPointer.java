package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class CloneLinkedListWithRandomPointer {

    class RandomLinkedList<T> {
        public T data;
        public RandomLinkedList next;
        public RandomLinkedList rand;

        public RandomLinkedList(T data) {
            this.data = data;
        }

        @Override
        public String toString() {
            return "RandomLinkedList{" +
                    "data=" + data +
                    '}';
        }
    }

    public <T> RandomLinkedList<T> cloneInput(RandomLinkedList<T> head1) {

        Map<RandomLinkedList<T>, RandomLinkedList<T>> hmap = new HashMap<>();
        RandomLinkedList<T> head2 = null, temp = head1, temp2 = null;
        while (temp != null) {
            RandomLinkedList newNode = new RandomLinkedList(head1.data);
            hmap.put(temp, newNode);
            if (head2 == null) {
                head2 = newNode;
            } else {
                temp2.next = newNode;
            }

            temp2 = newNode;
            temp = temp.next;
        }

        temp = head1;
        temp2 = head1;
        while (temp != null) {
            if (hmap.containsKey(temp.rand)) {
                temp2.rand = hmap.get(temp.rand);
            }

            temp = temp.next;
            temp2 = temp2.next;
        }

        return head2;

    }
}
