package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;

public class Sort012 {

    public SinglyLinkedList<Integer> sort(SinglyLinkedList<Integer> head) {
        int count[] = {0, 0, 0};

        SinglyLinkedList<Integer> temp = head;
        while (temp != null) {
            if (temp.data == 0) {
                count[0]++;
            } else if (temp.data == 1) {
                count[1]++;
            } else {
                count[2]++;
            }
            temp = temp.next;
        }

        temp = head;
        int i = 0;
        while (temp != null) {
            if (count[i] < 1) {
                i++;
            }

            temp.data = i;
            count[i]--;
            temp = temp.next;
        }

        return head;
    }
}
