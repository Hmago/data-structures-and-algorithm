package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import utils.LinkedListUtils;

/*
 * Pairwise swap elements of a given linked list
 * link: https://www.geeksforgeeks.org/pairwise-swap-elements-of-a-given-linked-list-by-changing-links/
 *
 * Time: O(n), Space: O(1)
 */
public class PairwiseSwap {

    public <T> SinglyLinkedList<T> swap(SinglyLinkedList<T> head) {
        if (head.next == null) {
            return head;
        }

        SinglyLinkedList<T> odd = head, even = head.next;
        while (odd != null && even != null) {
            LinkedListUtils.swap(odd, even);
            odd = odd.next == null ? null : odd.next.next;
            even = even.next == null ? null : even.next.next;
        }

        return head;
    }
}
