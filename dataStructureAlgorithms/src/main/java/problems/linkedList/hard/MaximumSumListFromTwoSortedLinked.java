package problems.linkedList.hard;

import dataStructures.SinglyLinkedList;

/*
 * Construct a Maximum Sum Linked List out of two Sorted Linked Lists having some Common nodes
 * Input:
 * List1 =  1->3->30->90->120->240->511
 * List2 =  0->3->12->32->90->125->240->249
 *
 * Output: Following is maximum sum linked list out of two input lists
 * list =  1->3->12->32->90->125->240->511
 * we switch at 3 and 240 to get above maximum sum linked list
 *
 * Time - O(n+m)
 * space - O(1)
 */
public class MaximumSumListFromTwoSortedLinked {

    public SinglyLinkedList<Integer> merge(SinglyLinkedList<Integer> head1, SinglyLinkedList<Integer> head2) {

        SinglyLinkedList<Integer> temp1 = head1, temp2 = head2, head = null, temp = null, subHead1 = head1, subHead2 = head2;
        int sum1 = temp1.data, sum2 = temp2.data;
        while (temp1 != null && temp2 != null) {
            if (temp1.data.equals(temp2.data)) {
                if (sum1 > sum2) {
                    if (head == null) {
                        head = head1;
                    } else {
                        temp.next = subHead1;
                    }
                    temp = temp1;
                } else {
                    if (head == null) {
                        head = head2;
                    } else {
                        temp.next = subHead2;
                    }
                    temp = temp2;
                }

                temp1 = temp1.next;
                temp2 = temp2.next;

                subHead1 = temp1;
                subHead2 = temp2;

                temp.next = null;

                sum1 = temp1.data;
                sum2 = temp2.data;
            } else if (temp1.data.compareTo(temp2.data) < 0) {
                temp1 = temp1.next;
                if (temp1 != null) {
                    sum1 = sum1 + temp1.data;
                }
            } else {
                temp2 = temp2.next;
                if (temp2 != null) {
                    sum2 = sum2 + temp2.data;
                }
            }
        }

        while (temp1 != null) {
            sum1 = sum1 + temp1.data;
            temp1 = temp1.next;
        }

        while (temp2 != null) {
            sum2 = sum2 + temp2.data;
            temp2 = temp2.next;
        }

        if (sum1 != 0 && sum1 > sum2) {
            temp.next = subHead1;
        } else if (sum1 != 0) {
            temp.next = subHead2;
        }

        return head;
    }
}
