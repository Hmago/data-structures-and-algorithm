package problems.array.easy;

public class ConsecutiveElementsInArray {

    /*
     * Check if array elements are consecutive
     * If array is {5, 2, 3, 1, 4}, then the function should return true because the array has consecutive numbers from 1 to 5.
     *
     * link: https://www.geeksforgeeks.org/check-if-array-elements-are-consecutive/
     */
    public boolean valid(int arr[]) {
        int min = Integer.MAX_VALUE, sum = 0;
        for (int number : arr) {
            sum = sum + number;

            if (min > number) {
                min = number;
            }
        }

        /* Using AP sum formula */
        int expected_sum = ((arr.length)*( 2*min + (arr.length - 1)))/2;

        return (expected_sum == sum);
    }
}
