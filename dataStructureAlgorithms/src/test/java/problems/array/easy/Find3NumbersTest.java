package problems.array.easy;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class Find3NumbersTest {
    private Find3Numbers obj = new Find3Numbers();

    @Test
    public void test1(){
        int arr[] = {12, 3, 4, 1, 6, 9};

        Assert.assertTrue(obj.doesExist(arr, 24));
    }
}
