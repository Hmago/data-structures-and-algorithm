package problems.array.phase1.medium;

/*
 *  Maximum Sum Path in Two Arrays
 *
 * Input:  ar1[] = {2, 3, 7, 10, 12}, ar2[] = {1, 5, 7, 8}
 * Output: 35
 * 35 is sum of 1 + 5 + 7 + 10 + 12.
 * We start from first element of arr2 which is 1, then we
 * move to 5, then 7.  From 7, we switch to ar1 (7 is common)
 * and traverse 10 and 12.
 *
 *
 * link: https://www.geeksforgeeks.org/maximum-sum-path-across-two-arrays/
 *
 * Time Complexity: O(n+m)
 * where n is the length of first Array and m is the length of second array
 *
 * Space Complexity: O(1)
 */
public class MaximumSumPathInTwoArrays {

    public int maxSum(int arr1[], int arr2[]) {
        int i = 0, j = 0, sum = 0, sum1 = 0, sum2 = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                sum = sum + Math.max(sum1, sum2) + arr1[i];
                sum1 = 0;
                sum2 = 0;
                j++;
                i++;
            } else if (arr1[i] < arr2[j]) {
                sum1 = sum1 + arr1[i];
                i++;
            } else {
                sum2 = sum2 + arr2[j];
                j++;
            }
        }

        while (i < arr1.length) {
            sum1 = sum1 + arr1[i];
            i++;
        }
        while (j < arr2.length) {
            sum2 = sum2 + arr2[j];
            j++;
        }

        sum = sum + Math.max(sum1, sum2);

        return sum;
    }
}
