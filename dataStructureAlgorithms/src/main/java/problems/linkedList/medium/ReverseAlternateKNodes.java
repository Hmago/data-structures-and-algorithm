package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import utils.LinkedListUtils;

/**
 * Reverse alternate K nodes in a Singly Linked List
 * Inputs:   1->2->3->4->5->6->7->8->9->NULL and k = 3
 * Output:   3->2->1->4->5->6->9->8->7->NULL.
 * <p>
 * Link: https://www.geeksforgeeks.org/reverse-alternate-k-nodes-in-a-singly-linked-list/
 * <p>
 * Time: O(kn)
 * space: O(1)
 */
public class ReverseAlternateKNodes {

    public <T> SinglyLinkedList<T> reverse(SinglyLinkedList<T> head, int k) {
        SinglyLinkedList<T> temp = head, behind = null;

        int count = 0;
        boolean flag = true;
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        while (temp != null) {
            if (count % k == 0) {
                temp = reverseLinkedList.reverse(temp, k);
                if (behind != null) {
                    behind.next = temp;
                } else {
                    head = temp;
                }

                int i = 0;
                while (i < k && temp != null) {
                    i++;
                    count++;
                    temp = temp.next;
                }

                if (temp == null) {
                    break;
                }
            }
            behind = temp;
            temp = temp.next;
            count++;
        }

        return head;
    }
}
