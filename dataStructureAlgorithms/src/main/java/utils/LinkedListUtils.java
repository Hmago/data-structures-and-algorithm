package utils;

import dataStructures.SinglyLinkedList;

public class LinkedListUtils {

    /*
     * Prints singly linked list
     */
    public static <T> void printSingly(SinglyLinkedList<T> head) {
        while (head != null) {
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println();
    }

    /*
     * Create SinglyLinkedList from Array
     * input data[] =  {1,2,3,4}
     * output head: 1->2->3->4->null
     */
    public static <T> SinglyLinkedList<T> createSinglyFromArray(T[] data) {
        if (data == null || data.length == 0) {
            return null;
        }

        SinglyLinkedList<T> head = SinglyLinkedList.createNode(data[0]), temp = head, nextElement;
        for (int i = 1; i < data.length; i++) {
            nextElement = SinglyLinkedList.createNode(data[i]);
            temp.next = nextElement;
            temp = temp.next;
        }

        return head;
    }

    /*
     * Checks if two Singly linked list are equal or not
     */
    public static <T> boolean isEqual(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        while (list1 != null || list2 != null) {
            if (list1 == null || list2 == null) {
                return false;
            } else if (!list1.data.equals(list2.data)) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }

    /*
     * Swap data of two LinkedListNodes
     */
    public static <T> void swap(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        T temp = list1.data;
        list1.data = list2.data;
        list2.data = temp;
    }

    /*
     * print circular LL
     */
    public static <T> void printCSinglyLL(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> temp = head;
        System.out.print(temp.data + "->");
        temp = temp.next;
        while (temp != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
    }

    /*
     * Create SinglyLinkedList from Array
     * input data[] =  {1,2,3,4}
     * output head: 1->2->3->4->1
     */
    public static <T> SinglyLinkedList<T> createCircularSinglyFromArray(T[] data) {
        if (data == null || data.length == 0) {
            return null;
        }

        SinglyLinkedList<T> head = SinglyLinkedList.createNode(data[0]), temp = head, nextElement;
        for (int i = 1; i < data.length; i++) {
            nextElement = SinglyLinkedList.createNode(data[i]);
            temp.next = nextElement;
            temp = temp.next;
        }
        temp.next = head;

        return head;
    }

    /*
     * Gives last node in the circular LL
     */
    public static <T> SinglyLinkedList<T> lastNodeInSinglyLL(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        return temp;
    }

    /*
     * Gives last node in the circular LL
     */
    public static <T> SinglyLinkedList<T> lastNodeInCircularSinglyLL(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> temp = head.next;
        while (temp.next != head) {
            temp = temp.next;
        }

        return temp;
    }

    /*
     * Checks if two Singly linked list are equal or not
     */
    public static <T> boolean isEqualCircularSinglyLL(SinglyLinkedList<T> list1, SinglyLinkedList<T> list2) {
        SinglyLinkedList<T> head1 = list1;
        SinglyLinkedList<T> head2 = list2;
        while ((list1 != null || list2 != null) && (list1 != head1 && list2 != head2)) {
            if (list1 == null || list2 == null) {
                return false;
            } else if (!list1.data.equals(list2.data)) {
                return false;
            }

            list1 = list1.next;
            list2 = list2.next;
        }

        return true;
    }

    public static <T> int size(SinglyLinkedList<T> head) {
        int size = 0;
        SinglyLinkedList<T> temp = head;
        while (temp != null) {
            size++;

            temp = temp.next;
        }

        return size;
    }

    public static <T> SinglyLinkedList<T> middle(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> slow = head, fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static <T> int middleCount(SinglyLinkedList<T> head) {
        SinglyLinkedList<T> slow = head, fast = head;

        int count = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            count++;
        }
        return count;
    }
}
