package algorithms.basic.sort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SelectionSortTest {

    private static SelectionSort selectionSort;

    @BeforeAll
    public static void init(){
        selectionSort = new SelectionSort();
    }

    @Test
    public void positiveTest1(){
        int arr[] = {1,2,3,5,4, 6, 7, 8};
        int expected[] = { 1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, selectionSort.sort(arr));
    }

    @Test
    public void positiveTest2(){
        int arr[] = {1,2,3,4, 5, 6, 7, 8};
        int expected[] = { 1, 2, 3, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, selectionSort.sort(arr));
    }

    @Test
    public void positiveTest3(){
        int arr[] = {1,1,1,4, 5, 6, 7, 8};
        int expected[] = { 1, 1,1, 4, 5, 6, 7, 8};
        assertArrayEquals(expected, selectionSort.sort(arr));
    }

    @Test
    public void positiveTest4(){
        int arr[] = {9,8,7,6,5,4,3,2,1};
        int expected[] = { 1, 2,3,4,5,6,7,8,9};
        assertArrayEquals(expected, selectionSort.sort(arr));
    }
}
