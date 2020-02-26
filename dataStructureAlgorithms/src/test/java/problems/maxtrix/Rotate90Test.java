package problems.maxtrix;

import org.junit.jupiter.api.Test;
import problems.matrix.Rotate90;
import utils.ArrayUtils;

public class Rotate90Test {

    private Rotate90 obj = new Rotate90();

    @Test
    public void test(){
        int arr[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}, {17, 18, 19, 20}};
        int newArr[][] = obj.rotate(arr);
        ArrayUtils.print2D(newArr);
    }
}
