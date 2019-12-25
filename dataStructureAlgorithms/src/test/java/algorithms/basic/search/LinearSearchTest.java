package algorithms.basic.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class LinearSearchTest {

    private static LinearSearch linearSearch;

    @BeforeAll
    public static void init(){
        linearSearch = new LinearSearch();
    }

    @Test
    void testPostive1(){
        int arr[] = {1,2,3,4,5};
        assertEquals(0, linearSearch.search(arr, 1));
    }

    @Test
    void testPostive2(){
        int arr[] = {1,2,3,4,5};
        assertEquals(4, linearSearch.search(arr, 5));
    }

    @Test
    void testPostive3(){
        int arr[] = {1,2,3,4,5};
        assertEquals(3, linearSearch.search(arr, 4));
    }

    @Test
    void testNegative1(){
        int arr[] = {1,2,3,4,5};
        assertEquals(-1, linearSearch.search(arr, 40));
    }
}
