package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class ReverseLLTest {

    private ReverseLL obj = new ReverseLL();

    @Test
    public void test1(){
        Integer inputData[] = {1, 2, 3, 4, 5};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.reverse(head1);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {5, 4, 3, 2, 1};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
