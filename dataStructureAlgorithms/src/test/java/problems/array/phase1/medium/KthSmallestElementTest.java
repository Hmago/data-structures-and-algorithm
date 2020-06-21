package problems.array.phase1.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class KthSmallestElementTest {

    private KthSmallestElement obj = new KthSmallestElement();

    @Test
    public void test1(){
        int arr[] = {7, 10, 4, 3, 20, 15};
        Assert.assertEquals(7, obj.find(arr, 3));
    }

    @Test
    public void test2(){
        int arr[] = {7, 10, 4, 3, 20, 15};
        Assert.assertEquals(10, obj.find(arr, 4));
    }
}
