package arrays;

public class Spiral {

    public static void main(String[] args) {

//        genSpiral(3);
        new Spiral().spiral(8);
    }

    private int[][] spiral(int n) {

        int value = 1;
        int width = 0;
        int height = 0;

        int[][] spiralArr = new int[n][n];
        while (value <= (n * n)) {

            while (width < n) {
                if (spiralArr[height][width] != 0) {
                    break;
                }
                spiralArr[height][width] = value++;
                width++;

            }

            //rotate anti clockwise
            height++;

            // adjust width pointer
            width--;

            while (height < n) {
                if (spiralArr[height][width] != 0) {
                    break;
                }
                spiralArr[height][width] = value++;
                height++;
            }

            //rotate anti clockwise
            width--;

            // adjust height pointer
            height--;


            while (width >= 0) {
                if (spiralArr[height][width] != 0) {
                    break;
                }
                spiralArr[height][width] = value++;
                width--;
            }

            //rotate anti clockwise
            height--;

            // adjust width pointer
            width++;

            while (height >= 0) {
                if (spiralArr[height][width] != 0) {
                    break;
                }
                spiralArr[height][width] = value++;
                height--;
            }

            //rotate anti clockwise
            width++;
            // adjust height pointer for previously visited row
            height++;
        }
        printArrray(spiralArr);
        return spiralArr;
    }

    private static void printArrray(int[][] arr) {
        for (int t = 0; t < arr.length; t++) {
            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[t][j] + " ");
            }
            System.out.print("\n");
        }
    }

    private int incrementIfInBounds(int attribute, int limit) {
        if (attribute < limit) {
            attribute += 1;
        }
        return attribute;
    }

    private int decrementIfInBounds(int attribute, int limit) {
        if (attribute > 0) {
            attribute += 1;
        }
        return attribute;
    }


    public static int[][] genSpiral(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("N must be >0");
        }
        int[] dc = new int[]{1, 0, -1, 0};
        int[] dr = new int[]{0, 1, 0, -1};
        int dir = 0, val = 0, r = 0, c = 0, limit = n * n;
        int[][] matrix = new int[n][n];
        while (val++ < limit) {
            matrix[r][c] = val;
            r += dr[dir];
            c += dc[dir];
            if (isInvalid(matrix, r, c)) {
                r -= dr[dir];
                c -= dc[dir];
                dir = (dir + 1) % 4;
                r += dr[dir];
                c += dc[dir];
            }
        }
        return matrix;
    }

    private static boolean isInvalid(int[][] m, int r, int c) {
        return r < 0 || c < 0 || r >= m.length || c >= m.length || m[r][c] != 0;
    }

}
