package problems.array.phase1.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class BestTimeToBuySellStockTest {

    private BestTimeToBuySellStock obj = new BestTimeToBuySellStock();

    @Test
    public void test1() {
        int arr[] = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(5, obj.maxProfileOneTime(arr));
    }

    @Test
    public void test2() {
        int arr[] = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, obj.maxProfileOneTime(arr));
    }

    @Test
    public void test3() {
        int arr[] = {7, 1, 5, 3, 6, 4};
        Assert.assertEquals(7, obj.maxProfileMultpleTimes(arr));
    }

    @Test
    public void test4() {
        int arr[] = {7, 6, 4, 3, 1};
        Assert.assertEquals(0, obj.maxProfileMultpleTimes(arr));
    }

    @Test
    public void test5() {
        int arr[] = {1, 2, 3, 4, 5};
        Assert.assertEquals(4, obj.maxProfileMultpleTimes(arr));
    }
}
