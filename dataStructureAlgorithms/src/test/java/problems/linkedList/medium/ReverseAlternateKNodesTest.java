package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class ReverseAlternateKNodesTest {
    private ReverseAlternateKNodes obj = new ReverseAlternateKNodes();

    @Test
    public void test1() {
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.reverse(head1, 3);
        LinkedListUtils.printSingly(head1);

        Integer outputData[] = {3, 2, 1, 4, 5, 6, 9, 8, 7};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(outputData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2() {
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.reverse(head1, 5);
        LinkedListUtils.printSingly(head1);

    }
}
