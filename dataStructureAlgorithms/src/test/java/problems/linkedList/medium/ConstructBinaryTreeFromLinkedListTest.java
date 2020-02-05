package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import dataStructures.Tree;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;
import utils.TreeUtils;

public class ConstructBinaryTreeFromLinkedListTest {

    private ConstructBinaryTreeFromLinkedList obj = new ConstructBinaryTreeFromLinkedList();

    @Test
    public void test1() {
        Integer inputData[] = {10, 12, 15, 25, 30, 36};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Tree<Integer> root = obj.construct(head1);
        TreeUtils.inOrder(root);
        TreeUtils.printChilds(root);
    }


}
