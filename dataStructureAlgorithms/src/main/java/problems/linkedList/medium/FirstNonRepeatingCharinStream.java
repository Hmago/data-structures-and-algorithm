package problems.linkedList.medium;

import dataStructures.DoublyLinkedList;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharinStream {

    private final String REPEATING_COUNT = "REPEATING_COUNT";
    private final String REF = "REF";

    private DoublyLinkedList<Character> head;
    private DoublyLinkedList<Character> tail;

    // a-> repeating=> false, ref=>DoublyLinkedList
    private Map<Character, Map<String, Object>> status = new HashMap<>();

    public FirstNonRepeatingCharinStream() {
        for (char i = 'a'; i <= 'z'; i++) {
            HashMap<String, Object> temp = new HashMap<>();
            temp.put(REPEATING_COUNT, 0);
            temp.put(REF, null);
            status.put(i, temp);
        }
    }

    private DoublyLinkedList<Character> addNonRepeatingNode(char alphabet) {
        DoublyLinkedList<Character> node = new DoublyLinkedList<>(alphabet);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.prev = tail;
            tail = node;
        }

        return node;
    }

    private void deleteNodeFromNonRepeatingElements(DoublyLinkedList<Character> node) {
        if (node == null) {
            return;
        }

        if (head == node) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }else{
                tail=null;
            }
        }else if (tail == node) {
            DoublyLinkedList<Character> temp = node.prev;
            temp.next = null;
            tail = temp;
        } else {
            DoublyLinkedList<Character> temp = node.prev;
            temp.next = node.next;
            node.next.prev = temp;
        }
    }

    public void add(char alphabet) {
        Integer repeating = (Integer) status.get(alphabet).get(REPEATING_COUNT);

        if (repeating == 0) {
            DoublyLinkedList<Character> node = addNonRepeatingNode(alphabet);
            status.get(alphabet).put(REF, node);
        } else if (repeating == 1) {
            this.deleteNodeFromNonRepeatingElements((DoublyLinkedList<Character>) status.get(alphabet).get(REF));
            status.get(alphabet).put(REF, null);
        }
        status.get(alphabet).put(REPEATING_COUNT, repeating + 1);
    }

    public Character getFirstNonRepeating() {
        if (head == null) {
            return null;
        }
        return head.data;
    }
}
