package problems.array.phase2;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author harshit.mago
 */
public class SearchInSortedAndRotatedTest {

    private SearchInSortedAndRotated obj = new SearchInSortedAndRotated();

    @Test
    public void test1() {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        Assert.assertEquals(8, obj.search(arr, 0, arr.length - 1, 3));
    }

    @Test
    public void test2() {
        int arr[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};

        Assert.assertEquals(-1, obj.search(arr, 0, arr.length - 1, 30));
    }

    @Test
    public void test3() {
        int arr[] = {30, 40, 50, 10, 20};

        Assert.assertEquals(3, obj.search(arr, 0, arr.length - 1, 10));
    }
}
