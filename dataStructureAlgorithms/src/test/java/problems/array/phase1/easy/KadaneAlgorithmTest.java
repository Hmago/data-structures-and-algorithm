package problems.array.phase1.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class KadaneAlgorithmTest {

    private KadaneAlgorithm obj = new KadaneAlgorithm();

    @Test
    public void test1(){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};

        Assert.assertEquals(7, obj.max(arr));
    }


    @Test
    public void test2(){
        int arr[] = {-2,1,-3,4,-1,2,1,-5,4};

        Assert.assertEquals(6, obj.max(arr));
    }
}
