package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class MergeTwoSortedLLTest {

    private MergeTwoSortedLL obj = new MergeTwoSortedLL();

    @Test
    public void test1() {
        Integer data[] = {1, 3, 5, 7};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(data);

        Integer data1[] = {2, 4, 6};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(data1);

        Integer output[] = {1, 2, 3, 4, 5, 6, 7};
        SinglyLinkedList<Integer> head = LinkedListUtils.createSinglyFromArray(output);
//        LinkedListUtils.printSingly(obj.merge(head1, head2));
        LinkedListUtils.printSingly(head);
        Assert.assertTrue(LinkedListUtils.isEqual(head, obj.merge(head1, head2)));
    }
}
