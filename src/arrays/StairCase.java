package arrays;

public class StairCase {

    public static void main(String[] args) {
        staircase(4);
    }

    public static void staircase(int n) {
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row + col >= n - 1) {
                    if ((col == n - 1)) {
                        System.out.print("#\n");
                    } else {
                        System.out.print("#");
                    }

                } else {
                    System.out.print(" ");
                }
            }
        }

    }
}
