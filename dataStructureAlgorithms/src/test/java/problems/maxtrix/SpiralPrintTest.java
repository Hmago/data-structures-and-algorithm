package problems.maxtrix;

import org.junit.jupiter.api.Test;
import problems.matrix.SpiralPrint;

public class SpiralPrintTest {
    private SpiralPrint obj = new SpiralPrint();

    @Test
    public void test1() {
        int arr[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}};
        obj.print(arr);
    }

    @Test
    public void test2() {
        int arr[][] = {{1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12}, {13, 14, 15, 16, 17, 18}};
        obj.print(arr);
    }
}
