package problems.linkedList.easy;

import java.util.HashMap;

public class CLoneLLWithRandomPointer {

    class RandomPointerLinedList {
        int data;
        RandomPointerLinedList next;
        RandomPointerLinedList rand;

        public RandomPointerLinedList(int data) {
            this.data = data;
            next = null;
            rand = null;
        }
    }

    public void cloneLL(RandomPointerLinedList head) {
        HashMap<RandomPointerLinedList, RandomPointerLinedList> oldToNew = new HashMap<>();

        RandomPointerLinedList temp = head, newHead = null, temp2 = null;
        while (temp.next != null) {

            RandomPointerLinedList newNode = new RandomPointerLinedList(temp.data);
            if (newHead == null) {
                newHead = newNode;
            } else {
                temp2.next = newNode;
            }
            temp2 = newHead;
            oldToNew.put(temp, temp2);
            temp = temp.next;
        }

        temp = head;
        temp2 = newHead;
        while (temp != null) {
            temp2.rand = oldToNew.get(temp.rand);

            temp = temp2.next;
            temp2 = temp2.next;
        }
    }
}
