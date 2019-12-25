package algorithms.basic.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class InterpolationSearchTest {
    private static InterpolationSearch interpolationSearch;

    @BeforeAll
    public static void init(){
        interpolationSearch = new InterpolationSearch();
    }

    @Test
    public void positiveTest1(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(0, interpolationSearch.search(arr,  10));
    }

    @Test
    public void positiveTest2(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(8, interpolationSearch.search(arr,  90));
    }

    @Test
    public void positiveTest3(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(4, interpolationSearch.search(arr,  50));
    }

    @Test
    public void positiveTest4(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(1, interpolationSearch.search(arr,  20));
    }

    @Test
    public void positiveTest5(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(7, interpolationSearch.search(arr,  80));
    }

    @Test
    public void negativeTest1(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(-1, interpolationSearch.search(arr,  0));
    }

    @Test
    public void negativeTest2(){
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(-1, interpolationSearch.search(arr,  100));
    }
}
