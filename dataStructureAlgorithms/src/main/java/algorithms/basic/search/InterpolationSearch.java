package algorithms.basic.search;

public class InterpolationSearch {

    /*
     * Method will return the index of the element else -1 if not found
     */
    public int search(int arr[], int number){
        int left = 0, right=arr.length-1;

        while(left<right && number>=arr[left] && number<=arr[right]){

            int pos = left + ((number-arr[left])*(right-left))/(arr[right]-arr[left]);
            if(arr[pos] == number){
                return pos;
            }

            if(arr[pos]>number){
                right = pos-1;
            }else{
                left = pos+1;
            }
        }

        return -1;
    }
}
