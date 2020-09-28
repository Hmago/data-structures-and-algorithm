package problems.dp;

public class CuttingRod {

    public static int maxPrice(int size[], int price[], int length) {
        if (length == 0) {
            return 0;
        }

        int n = size.length;
        int holder[][] = new int[n + 1][length + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= length; j++) {
                if (j < size[i - 1]) {
                    holder[i][j] = holder[i - 1][j];
                } else {
                    holder[i][j] = Math.max(holder[i - 1][j], price[i - 1] + holder[i][j - size[i - 1]]);
                }
            }
        }

        return holder[n][length];
    }

    public static void main(String[] args) {
        int size[] = {1, 2, 3, 4};
        int price[] = {2, 5, 7, 8};
        System.out.println("Max price = "+maxPrice(size, price, 5));
    }
}
