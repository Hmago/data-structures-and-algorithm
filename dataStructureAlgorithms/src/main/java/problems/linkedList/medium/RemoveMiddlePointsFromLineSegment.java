package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

import java.util.List;

/*
 * Given a linked list of line segments, remove middle points
 * Input:  (0,10)->(1,10)->(5,10)->(7,10)
                                  |
                                (7,5)->(20,5)->(40,5)
* Output: Linked List should be changed to following
        (0,10)->(7,10)
                  |
                (7,5)->(40,5)
 * Link: https://www.geeksforgeeks.org/given-linked-list-line-segments-remove-middle-points/
 */
public class RemoveMiddlePointsFromLineSegment {

    public SinglyLinkedList<List<Integer>> remove(SinglyLinkedList<List<Integer>> head) {
        boolean h = true, v = true;
        SinglyLinkedList<List<Integer>> temp = head;
        while (temp != null && temp.next != null) {
            if (v && temp.data.get(1) == temp.next.data.get(1)) {
                temp.next = temp.next.next;
                h = false;
                v = true;
            } else if (h && temp.data.get(0) == temp.next.data.get(0)) {
                temp.next = temp.next.next;
                h = true;
                v = false;
            } else {
                h = true;
                v = true;
            }
        }

        return head;
    }
}
