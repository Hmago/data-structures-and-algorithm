package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

/*
 * Multiply two numbers represented by Linked Lists
 * Link: https://www.geeksforgeeks.org/multiply-two-numbers-represented-linked-lists/
 *
 * Input : 9->4->6
 *       8->4
 * Output : 79464
 *
 * Time: O(n+m)
 * Space: O(1)
 */
public class MultiplyTwoNumbers {

    public int multiply(SinglyLinkedList<Integer> head1, SinglyLinkedList<Integer> head2) {
        int num1 = 0, num2 = 0;
        while (head1 != null) {
            num1 = num1 * 10 + head1.data;
            head1 = head1.next;
        }

        System.out.println(num1);
        while (head2 != null) {
            num2 = num2 * 10 + head2.data;
            head2 = head2.next;
        }

        System.out.println(num2);
        return num1 * num2;
    }
}
