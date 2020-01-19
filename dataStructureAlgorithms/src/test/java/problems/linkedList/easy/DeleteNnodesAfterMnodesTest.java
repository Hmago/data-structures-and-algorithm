package problems.linkedList.easy;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class DeleteNnodesAfterMnodesTest {

    private DeleteNnodesAfterMnodes obj = new DeleteNnodesAfterMnodes();

    @Test
    public void test1(){
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7, 8};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.delete(head1, 2,2);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {1, 2, 5, 6};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }

    @Test
    public void test2(){
        Integer inputData[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        SinglyLinkedList<Integer> head1 = LinkedListUtils.createSinglyFromArray(inputData);
        head1 = obj.delete(head1, 2,3);
        LinkedListUtils.printSingly(head1);

        Integer expectedData[] = {1, 2, 3, 6, 7, 8};
        SinglyLinkedList<Integer> head2 = LinkedListUtils.createSinglyFromArray(expectedData);

        Assert.assertTrue(LinkedListUtils.isEqual(head1, head2));
    }
}
