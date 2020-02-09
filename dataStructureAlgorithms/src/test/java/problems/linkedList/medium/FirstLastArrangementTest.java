package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class FirstLastArrangementTest {

    private FirstLastArrangement obj = new FirstLastArrangement();

    @Test
    public void testEven1() {
        FirstLastArrangement obj = new FirstLastArrangement();

        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7, 8};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.arrange(head1);

        Integer outputData[] = {1, 8, 2, 7, 3, 6, 4, 5};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(outputData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void testOdd1() {
        FirstLastArrangement obj = new FirstLastArrangement();

        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.arrange(head1);

        Integer outputData[] = {1, 7, 2, 6, 3, 5, 4};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(outputData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
