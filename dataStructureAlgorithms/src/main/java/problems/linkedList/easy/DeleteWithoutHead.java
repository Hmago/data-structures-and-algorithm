package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

public class DeleteWithoutHead {

    public void delete(SinglyLinkedList<Integer> pos) {
        if (pos == null) {
            return;
        }

        if (pos.next == null) {
            pos.data = null;
            return;
        }

        pos.data = pos.next.data;
        pos.next = pos.next.next;
    }
}
