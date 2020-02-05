package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

/*
 * Delete nodes which have a greater value on right side
 * Link: https://www.geeksforgeeks.org/delete-nodes-which-have-a-greater-value-on-right-side/
 *
 * 12->15->10->11->5->6->2->3->NULL should be changed to 15->11->6->3->NULL
 * 10->20->30->40->50->60->NULL should be changed to 60->NULL
 *
 * Time: O(n)
 * Space: O(1)
 */
public class DeleteNodesHavingGreaterRightNode {

    public SinglyLinkedList<Integer> delete(SinglyLinkedList<Integer> head) {
        while (head.next != null && head.data < head.next.data) {
            head = head.next;
        }

        SinglyLinkedList<Integer> last = head, current = head.next;
        while (current != null && current.next != null) {
            if (current.data < current.next.data) {
                last.next = current.next;
                current = current.next;
            } else {
                last = last.next;
                current = current.next;
            }
        }
        return head;
    }
}

