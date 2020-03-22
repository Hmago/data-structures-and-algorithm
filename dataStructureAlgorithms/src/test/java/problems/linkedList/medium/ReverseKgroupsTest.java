package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class ReverseKgroupsTest {

    private ReverseKgroups<Integer> obj= new ReverseKgroups<>();

    @Test
    public void test1(){
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7, 8};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.reverse(head1, 3);
        LinkedListUtils.printSingly(head1);

        Integer outputData[] = {3, 2, 1, 6, 5, 4, 8, 7};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(outputData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
