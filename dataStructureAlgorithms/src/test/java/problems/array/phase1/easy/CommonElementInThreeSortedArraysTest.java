package problems.array.phase1.easy;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;

public class CommonElementInThreeSortedArraysTest {

    private static CommonElementInThreeSortedArrays obj = new CommonElementInThreeSortedArrays();

    @Test
    public void test1(){
        int arr1[] = {1, 5, 10, 20, 40, 80};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 15, 20, 30, 70, 80, 120};

        List<Integer> expected = new ArrayList<>();
        expected.add(20);
        expected.add(80);
        assertThat(expected, CoreMatchers.is(obj.intersection(arr1, arr2, arr3)));
    }

    @Test
    public void test2(){
        int arr1[] = {1, 5, 5};
        int arr2[] = {3, 4, 5, 5, 10};
        int arr3[] = {5, 5, 10, 20};

        List<Integer> expected = new ArrayList<>();
        expected.add(5);
        expected.add(5);
        assertThat(expected, CoreMatchers.is(obj.intersection(arr1, arr2, arr3)));
    }
}
