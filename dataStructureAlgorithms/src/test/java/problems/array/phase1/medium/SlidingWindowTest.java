package problems.array.phase1.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author harshit.mago
 */
public class SlidingWindowTest {

    private SlidingWindow obj = new SlidingWindow();

    @Test
    public void test1(){
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        List<Integer> result = obj.find(arr, 3);

        for(Integer num: result){
            System.out.print(num+", ");
        }


    }
}
