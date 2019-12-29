package algorithms.basic.sort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    private static QuickSort quickSort;

    @BeforeAll
    public static void init() {
        quickSort = new QuickSort();
    }

    @Test
    public void positiveTest1() {
        int arr[] = {1, 2, 3, 5, 4, 6, 7, 8, 1, 1, 1};
        int expected[] = {1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void positiveTest2() {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int expected[] = {1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void positiveTest3() {
        int arr[] = {1, 1, 1, 4, 5, 6, 7, 8};
        int expected[] = {1, 1, 1, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void positiveTest4() {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int expected[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected, quickSort.sort(arr));
    }

    @Test
    public void negativeTest1() {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        assertArrayEquals(arr, quickSort.sort(arr));
    }
}
