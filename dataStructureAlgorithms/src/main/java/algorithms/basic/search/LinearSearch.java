package algorithms.basic.search;

public class LinearSearch {

    /*
     * Method will return the index of the element else -1 if not found
     */
    public int search(int arr[], int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {5,3,6,8,12,4,6};
        LinearSearch ls =new LinearSearch();
        System.out.println(ls.search(arr, 3));
    }

}
