package problems.matrix;

public class Rotate90 {

    public int[][] rotate(int arr[][]){
        int newArr[][] = new int[arr[0].length][arr.length];

        int row = 0;
        for(int i=arr[0].length-1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                newArr[row][j] = arr[j][i];
            }
            row++;
        }

        return newArr;
    }
}
