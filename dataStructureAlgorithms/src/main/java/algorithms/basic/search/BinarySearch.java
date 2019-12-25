package algorithms.basic.search;

public class BinarySearch {

    /*
     * Method will return the index of the element else -1 if not found
     * arr: Sorted Int array
     * l: left
     * r: right
     * number: to be searched
     */
    public int search(int arr[], int l, int r, int number) {
        if(l>r){
            return -1;
        }

        int mid = (l+r)/2;
        if(arr[mid] == number){
            return mid;
        }

        if(arr[mid]>number){
            return search(arr, l, mid-1, number);
        }else{
            return search(arr, mid+1, r, number);
        }
    }
}
