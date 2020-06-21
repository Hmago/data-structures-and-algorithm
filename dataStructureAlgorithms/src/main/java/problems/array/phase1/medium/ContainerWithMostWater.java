package problems.array.phase1.medium;

/*
 * Container with Most Water
 * Input : [1, 5, 4, 3]
 * Output : 6
 * Explanation :
 * 5 and 3 are distance 2 apart.
 * So the size of the base = 2.
 * Height of container = min(5, 3) = 3.
 * So total area = 3 * 2 = 6
 *
 * link: https://www.geeksforgeeks.org/container-with-most-water/
 * Time: O(n), Space:O(1)
 */
public class ContainerWithMostWater {

    private int area(int arr[], int left, int right) {
        return (right - left) * Math.min(arr[left], arr[right]);
    }

    public int maxArea(int arr[]) {
        int left = 0, right = arr.length - 1, maxArea = 0, area = 0;
        while (left < right) {
            area = area(arr, left, right);

            maxArea = Math.max(area, maxArea);

            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}