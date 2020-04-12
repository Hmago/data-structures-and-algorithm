package problems.stack;

import org.junit.jupiter.api.Test;

import java.util.Stack;

/**
 * @author harshit.mago
 */
public class ReverseStackUsingRecursionTest {

    private ReverseStackUsingRecursion obj = new ReverseStackUsingRecursion();

    @Test
    public void test1(){
        Stack<Integer> input = new Stack<Integer>();
        for(int i=1;i<6;i++){
            input.push(i);
        }

        System.out.println("Original="+input.toString());
        obj.reverse(input);
        System.out.println("After="+input.toString());
    }
}
