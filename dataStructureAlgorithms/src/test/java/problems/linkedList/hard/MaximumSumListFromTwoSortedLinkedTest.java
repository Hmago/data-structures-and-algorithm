package problems.linkedList.hard;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class MaximumSumListFromTwoSortedLinkedTest {
    private MaximumSumListFromTwoSortedLinked obj = new MaximumSumListFromTwoSortedLinked();

    @Test
    public void test1() {
        Integer inputData1[] = {1, 3, 30, 90, 120, 240, 511};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData1);

        Integer inputData2[] = {0, 3, 12, 32, 90, 125, 240, 249};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(inputData2);
        
        SinglyLinkedList<Integer> head = obj.merge(head1, head2);

        Integer expected[] = {1, 3, 12, 32, 90, 125, 240, 511};
        SinglyLinkedList<Integer> output = LinkedListUtils.createSinglyFromArray(expected);

        LinkedListUtils.printSingly(head);
        Assert.assertTrue(LinkedListUtils.isEqual(head, output));
    }
}
