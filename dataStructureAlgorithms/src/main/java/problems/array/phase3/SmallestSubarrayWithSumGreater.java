package problems.array.phase3;

public class SmallestSubarrayWithSumGreater {

    public static int minLength(int arr[], int sum) {
        int currentSum = 0, start = 0, minLength = arr.length;
        for (int i = 0; i < arr.length; i++) {
            currentSum = currentSum + arr[i];
            while (currentSum > sum) {
                currentSum = currentSum - arr[start];
                start++;
            }

            if (currentSum == sum && minLength > (i - start + 1)) {
                minLength = i - start + 1;
            }
        }

        return minLength;
    }

    public static void main(String[] args) {
        int arr[]= {1,4,45,6,0,19};

        System.out.println(minLength(arr, 51));
    }
}
