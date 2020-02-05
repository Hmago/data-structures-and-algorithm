package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import dataStructures.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class ConstructBinaryTreeFromLinkedList {

    public <T> Tree<T> construct(SinglyLinkedList<T> head) {
        Tree<T> root = null;
        if (head != null) {
            root = new Tree<>(head.data);
        }

        head = head.next;

        boolean isRight = false;
        Queue<Tree<T>> queue = new LinkedList<>();
        queue.add(root);
        while (head != null) {
            Tree<T> temp = queue.peek();

            Tree<T> newNode = new Tree<>(head.data);
            if (isRight) {
                temp.right = newNode;
                queue.poll();
            } else {
                temp.left = newNode;
            }
            isRight = !isRight;
            queue.add(newNode);

            head = head.next;
        }

        return root;
    }
}
