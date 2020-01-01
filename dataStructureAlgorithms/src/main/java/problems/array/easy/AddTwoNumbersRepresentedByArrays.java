package problems.array.easy;

public class AddTwoNumbersRepresentedByArrays {

    public int sum(int arr1[], int arr2[]) {
        int arr1_sum = 0, arr2_sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1_sum = arr1_sum * 10 + arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2_sum = arr2_sum * 10 + arr2[i];
        }

        return (arr1_sum + arr2_sum);
    }
}
