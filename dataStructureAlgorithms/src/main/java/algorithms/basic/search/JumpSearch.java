package algorithms.basic.search;

public class JumpSearch {

    /*
     * Method will return the index of the element else -1 if not found
     */
    public int search(int arr[], int number){
        int step = (int)Math.sqrt(arr.length);

        int next=0, prev=0, rightMost = arr.length-1;
        while(next<rightMost && arr[Math.min(next, rightMost)] < number){
            if(arr[Math.min(next, rightMost)] == number){
                return next;
            }

            prev=next;
            next=next+step;
        }

        while(prev<=Math.min(next, rightMost)){
            if(arr[prev]==number){
                return prev;
            }
            prev++;
        }
        return -1;
    }
}
