package problems.matrix;

/**
 * @author harshit.mago
 */
public class RatInMaze {

    private int input[][];
    private int output[][];

    private int maxRow;
    private int maxCol;

    public RatInMaze(int[][] input) {
        this.input = input;

        this.maxRow = input.length;
        this.maxCol = input[0].length;
        this.output = new int[maxRow][maxCol];
    }

    boolean isPathExists(int row, int col) {
        if(row>=maxRow || col>=maxCol){
            return false;
        }

        boolean exists = false;
        if(input[row][col]==1) {
            // final step
            if (row == maxRow - 1 && col == maxCol - 1) {
                output[row][col] = 1;
                return true;
            }

            exists = isPathExists(row, col+1);
            if(!exists){
                exists = isPathExists(row+1, col);
            }

            if(!exists){
                exists = isPathExists(row, col-1);
            }

            if(!exists){
                exists = isPathExists(row-1, col);
            }
        }

        if(exists){
            output[row][col] = 1;
        }
        return exists;
    }
}
