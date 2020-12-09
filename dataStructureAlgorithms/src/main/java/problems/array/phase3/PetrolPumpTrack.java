package problems.array.phase3;

public class PetrolPumpTrack {

    public static int isPossible(int petrol[], int distance[]) {
        int start = -1, end = 0, save = 0;
        boolean visited = false;

        while (true) {
            save = save + petrol[end] - distance[end];
            if (save < 0) {
                start = -1;
                save = 0;
            } else if (start == -1) {
                start = end;
            }

            if (end == petrol.length - 1) {
                if (visited) {
                    return -1;
                }
                visited = true;
            }

            end = (end + 1) % petrol.length;
            if (end == start) {
                return start;
            }
        }
    }

    public static void main(String[] args) {
        int petrol[] = {1, 2, 3, 4, 5};
        int distance[] = {3, 4, 5, 1, 2};

        System.out.println(isPossible(petrol, distance));
    }
}
