package problems.array.easy;

/*
 * Find the minimum distance between two numbers
 * Input: arr[] = {3, 5, 4, 2, 6, 5, 6, 6, 5, 4, 8, 3}, x = 3, y = 6
 * Output: Minimum distance between 3 and 6 is 4.
 *
 * Link: https://www.geeksforgeeks.org/find-the-minimum-distance-between-two-numbers/
 *
 * Returns: distance between the pair
 * -1 if invalid pair
 */
public class MinimumDistanceBetweenTwoNumbers {

    public int compute(int arr[], int firstNUmber, int secondNumber) {
        int firsNumberIndex = Integer.MAX_VALUE, secondNumberIndex = Integer.MAX_VALUE, distance = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == firstNUmber) {
                firsNumberIndex = i;
            }

            if (arr[i] == secondNumber) {
                secondNumberIndex = i;
            }

            if (Math.abs(secondNumberIndex - firsNumberIndex) < distance) {
                distance = Math.abs(secondNumberIndex - firsNumberIndex);
            }

        }

        if (Math.abs(distance) > arr.length) {
            return -1;
        }

        return distance;
    }
}
