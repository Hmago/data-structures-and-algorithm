package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

/*
 * https://www.geeksforgeeks.org/delete-n-nodes-after-m-nodes-of-a-linked-list/
 *
 * M = 2, N = 2
 * Linked List: 1->2->3->4->5->6->7->8
 * Output:
 * Linked List: 1->2->5->6
 */
public class DeleteNnodesAfterMnodes {

    public <T> SinglyLinkedList<T> delete(SinglyLinkedList<T> head, int m, int n) {
        SinglyLinkedList<T> temp = head;

        int i = 0, j = 0;
        while (temp != null) {
            i++;
            if (i % n == 0) {
                j=0;
                while (temp.next != null && j < m) {
                    temp.next = temp.next.next;
                    j++;
                }

                i = 0;
            }

            temp = temp.next;
        }

        return head;
    }
}
