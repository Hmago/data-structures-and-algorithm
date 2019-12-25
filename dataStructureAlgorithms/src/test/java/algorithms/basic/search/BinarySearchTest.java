package algorithms.basic.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    private static BinarySearch binarySearch;

    @BeforeAll
    public static void init(){
        binarySearch = new BinarySearch();
    }

    @Test
    public void positiveTest1(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(0, binarySearch.search(arr, 0, arr.length-1, 10));
    }

    @Test
    public void positiveTest2(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(8, binarySearch.search(arr, 0, arr.length-1, 90));
    }

    @Test
    public void positiveTest3(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(4, binarySearch.search(arr, 0, arr.length-1, 50));
    }

    @Test
    public void positiveTest4(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(1, binarySearch.search(arr, 0, arr.length-1, 20));
    }

    @Test
    public void positiveTest5(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(7, binarySearch.search(arr, 0, arr.length-1, 80));
    }

    @Test
    public void negativeTest1(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(-1, binarySearch.search(arr, 0, arr.length-1, 0));
    }

    @Test
    public void negativeTest2(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(-1, binarySearch.search(arr, 0, arr.length-1, 100));
    }
}
