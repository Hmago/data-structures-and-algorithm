package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class Sort012Test {

    private Sort012 obj = new Sort012();

    @Test
    public void test1(){
        Integer data[] = {1,1,2,0,2,0};
        SinglyLinkedList<Integer> head = LinkedListUtils.createSinglyFromArray(data);
        head = obj.sort(head);

        LinkedListUtils.printSingly(head);
        Integer output[] = {0, 0, 1, 1, 2, 2};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(output);
        LinkedListUtils.printSingly(head1);

        Assert.assertTrue(LinkedListUtils.isEqual(head, head1));

    }
}
