package algorithms.basic.search;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class JumpSearchTest {
    private static JumpSearch jumpSearch;

    @BeforeAll
    public static void init(){
        jumpSearch = new JumpSearch();
    }

    @Test
    void testPostive1(){
        int arr[] = {1,2,3,4,5};
        assertEquals(0, jumpSearch.search(arr, 1));
    }

    @Test
    void testPostive2(){
        int arr[] = {1,2,3,4,5};
        assertEquals(4, jumpSearch.search(arr, 5));
    }

    @Test
    void testPostive3(){
        int arr[] = {1,2,3,4,5};
        assertEquals(3, jumpSearch.search(arr, 4));
    }

    @Test
    void testNegative1(){
        int arr[] = {1,2,3,4,5};
        assertEquals(-1, jumpSearch.search(arr, 40));
    }

    @Test
    void testNegative2(){
        int arr[] = {1,2,3,4,5};
        assertEquals(-1, jumpSearch.search(arr, 0));
    }
}
