package problems.array.easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class MinimumDistanceBetweenTwoNumbersTest {

    private MinimumDistanceBetweenTwoNumbers obj = new MinimumDistanceBetweenTwoNumbers();

    @Test
    public void test1() {
        int arr[] = {1, 2};
        assertEquals(1, obj.compute(arr, 1, 2));
    }

    @Test
    public void test2() {
        int arr[] = {3, 4, 5};
        assertEquals(2, obj.compute(arr, 3, 5));
    }

    @Test
    public void test3() {
        int arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3};
        assertEquals(4, obj.compute(arr, 3, 6));
    }

    @Test
    public void test4() {
        int arr[] = {2, 5, 3, 5, 4, 4, 2, 3};
        assertEquals(1, obj.compute(arr, 3, 2));
    }
}
