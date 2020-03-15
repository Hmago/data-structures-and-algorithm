package problems.array.medium;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ProductArrayPuzzleTest {

    private ProductArrayPuzzle obj = new ProductArrayPuzzle();

    @Test
    public void test1(){
        int arr[] = {10, 3, 5, 6, 2};
        int output[] = {180, 600, 360, 300, 900};

        Assert.assertArrayEquals(output, obj.evaluate(arr));
    }

}
