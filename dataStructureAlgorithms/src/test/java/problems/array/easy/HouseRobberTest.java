package problems.array.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {
    private HouseRobber obj = new HouseRobber();

    @Test
    public void test1(){
        int arr[] = {6, 7, 1, 3, 8, 2, 4};

        Assert.assertEquals(19, obj.max(arr));
    }

    @Test
    public void test2(){
        int arr[] = {5, 3, 4, 11, 2};

        Assert.assertEquals(16, obj.max(arr));
    }
}
