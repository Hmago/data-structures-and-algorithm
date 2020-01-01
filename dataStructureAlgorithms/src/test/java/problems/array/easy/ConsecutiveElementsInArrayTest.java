package problems.array.easy;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ConsecutiveElementsInArrayTest {

    private static ConsecutiveElementsInArray mainClass = new ConsecutiveElementsInArray();

    @Test
    public void test1() {
        int arr[] = {5, 2, 3, 1, 4};
        assertTrue(mainClass.valid(arr));
    }

    @Test
    public void test2() {
        int arr[] = {83, 78, 80, 81, 79, 82};
        assertTrue(mainClass.valid(arr));
    }

    @Test
    public void test3() {
        int arr[] = {34, 23, 52, 12, 3};
        assertFalse(mainClass.valid(arr));
    }

    @Test
    public void test4() {
        int arr[] = {7, 6, 5, 5, 3, 4};
        assertFalse(mainClass.valid(arr));
    }

    @Test
    public void test5() {
        int arr[] = {-5, -2, -3, -1, -4};
        assertTrue(mainClass.valid(arr));
    }
}
