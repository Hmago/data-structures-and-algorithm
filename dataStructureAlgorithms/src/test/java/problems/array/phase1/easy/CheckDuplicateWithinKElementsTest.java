package problems.array.phase1.easy;

import org.junit.Test;

import static junit.framework.Assert.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class CheckDuplicateWithinKElementsTest {

    private static CheckDuplicateWithinKElements obj = new CheckDuplicateWithinKElements();

    @Test
    public void test1() {
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
        assertFalse(obj.containsDuplicate(arr, 3));
    }

    @Test
    public void test2() {
        int arr[] = {1, 2, 3, 1, 4, 5};
        assertTrue(obj.containsDuplicate(arr, 3));
    }

    @Test
    public void test3() {
        int arr[] = {1, 2, 3, 4, 5};
        assertFalse(obj.containsDuplicate(arr, 3));
    }

    @Test
    public void test4() {
        int arr[] = {1, 2, 3, 4, 4};
        assertTrue(obj.containsDuplicate(arr, 3));
    }
}
