package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;

/**
 *
 */
public class RemoveLoop2<T> {

    private SinglyLinkedList<T> loopNode(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> slow = head, fast = head.next;

        while (fast != null || fast.next != null) {
            if (fast == slow) {
                return fast;
            }

            slow = slow.next;
            fast = fast.next.next;
        }

        return null;
    }

    public void remove(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> loopNode = loopNode(head);
        if (loopNode == null) {
            return;
        }

        SinglyLinkedList<T> outerLoop = head, temp = null;
        while (outerLoop != loopNode) {
            temp = loopNode;
            while (temp.next != loopNode) {
                if (temp.next == outerLoop) {
                    temp.next = null;
                    return;
                }
                temp = temp.next;
            }


            outerLoop = outerLoop.next;
        }
    }


}
