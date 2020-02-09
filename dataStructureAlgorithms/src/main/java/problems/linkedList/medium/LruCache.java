package problems.linkedList.medium;


import dataStructures.DoublyLinkedList;

import java.util.HashMap;
import java.util.Map;

/**
 * LRU Cache Implementation
 * <p>
 * Link: https://www.geeksforgeeks.org/lru-cache-implementation/
 */
public class LruCache<T> {

    private int size;
    private int maxSize;
    private DoublyLinkedList<T> head;
    private DoublyLinkedList<T> last;
    private Map<T, DoublyLinkedList> map;

    public LruCache(int size) {
        this.maxSize = size;
        map = new HashMap<>();
    }

    public T get(T data) {
        if (head == null) {
            head = new DoublyLinkedList<>(data);
            map.put(data, head);
            size++;
            return data;
        }
        DoublyLinkedList<T> current = null;
        if (map.containsKey(data)) {
            current = map.get(data);
            DoublyLinkedList<T> prev = current.prev, next = current.next;
            prev.next = next;
            next.prev = prev;
            last.next = current;
        } else {
            size++;
            current = new DoublyLinkedList<>(data);
            if (size > maxSize) {
                head = head.next;
                head.prev = null;
                size--;
            }
        }
        current.prev = last;
        last = current;

        return data;
    }
}
