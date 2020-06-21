package problems.array.phase1.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TripletThatsSumToGivenValueTest {

    private TripletThatsSumToGivenValue obj = new TripletThatsSumToGivenValue();

    @Test
    public void test1() {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        Assert.assertTrue(obj.isCombinationExists(arr, sum));
    }

    @Test
    public void test2() {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 122;
        Assert.assertFalse(obj.isCombinationExists(arr, sum));
    }

    @Test
    public void test3() {
        int arr[] = {1, 4, 45, 6, 10, 8};
        int sum = 50;
        Assert.assertTrue(obj.isCombinationExists(arr, sum));
    }

    @Test
    public void test4() {
        int arr[] = {1, 4, 45, 6, 10, 8, 0, 0, 0};
        int sum = 0;
        Assert.assertTrue(obj.isCombinationExists(arr, sum));
    }
}
