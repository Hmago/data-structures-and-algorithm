package problems.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author harshit.mago
 */
public class SortStackUsingRecurrsionTest {

    private SortStackUsingRecurrsion obj = new SortStackUsingRecurrsion();

    @Test
    public void test() {
        Stack<Integer> input = new Stack<Integer>();
        input.push(10);
        input.push(1);
        input.push(3);
        input.push(13);
        input.push(18);
        input.push(-1);
        input.push(5);

        System.out.println("Original="+input.toString());
        obj.sort(input);
        System.out.println("After="+input.toString());
    }

}
