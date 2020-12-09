package problems.array.phase3;

public class AddTwoNumbersRepresentedByArrays {

    public static int arraySum(int arr[]) {
        if (arr == null || arr.length == 0) {
            return 0;
        }

        int i = 0, sum = 0;
        while (i < arr.length) {
            sum = sum * 10 + arr[i];
            i++;
        }

        return sum;
    }

    public static int add(int a[], int b[]) {
        return arraySum(a)+arraySum(b);
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3};
        int arr2[] = {1, 2, 3, 2};
        System.out.println(add(arr1, arr2));
    }
}
