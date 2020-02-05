package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class DeleteNodesHavingGreaterRightNodeTest {

    private DeleteNodesHavingGreaterRightNode obj = new DeleteNodesHavingGreaterRightNode();

    @Test
    public void test1() {
        Integer inputData[] = {12, 15, 10, 11, 5, 6, 2, 3};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.delete(head1);

        Integer expectedData[] = {15, 11, 6, 3};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData[] = {10, 20, 30, 40, 50, 60};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.delete(head1);

        Integer expectedData[] = {60};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
