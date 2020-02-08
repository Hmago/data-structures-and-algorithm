package problems.linkedList.medium;

import dataStructures.SinglyLinkedList;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import utils.LinkedListUtils;

public class PalindromeTest {

    private Palindrome obj = new Palindrome();

    @Test
    public void test1(){
        Character inputData[] = {'N', 'I', 'T', 'I', 'N'};
        SinglyLinkedList<Character> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Assert.assertTrue(obj.isIt(head1));
    }

    @Test
    public void test2(){
        Character inputData[] = {'N', 'I', 'T', 'T', 'I', 'N'};
        SinglyLinkedList<Character> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Assert.assertTrue(obj.isIt(head1));
    }

    @Test
    public void test3(){
        Character inputData[] = {'N', 'I', 'T', 'K', 'G'};
        SinglyLinkedList<Character> head1 = LinkedListUtils.createSinglyFromArray(inputData);

        Assert.assertFalse(obj.isIt(head1));
    }
}
