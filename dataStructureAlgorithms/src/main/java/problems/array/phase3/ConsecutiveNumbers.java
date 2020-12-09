package problems.array.phase3;

public class ConsecutiveNumbers {

    public static boolean isConsecutive(int arr[]) {

        if (arr.length < 2) {
            return true;
        }

        int sum = arr[0], min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int expectedSum = (arr.length * (2 * min + arr.length - 1)) / 2;
        return expectedSum == sum;
    }

    public static void main(String[] args) {
        int arr1[] = {5, 2, 3, 1, 4};
        System.out.println(isConsecutive(arr1));

        int arr2[] = {83, 78, 80, 81, 79, 82};
        System.out.println(isConsecutive(arr2));

        int arr3[] = {34, 23, 52, 12, 3};
        System.out.println(isConsecutive(arr3));
    }
}
