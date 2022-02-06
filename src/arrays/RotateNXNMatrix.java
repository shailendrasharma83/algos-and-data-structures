
package arrays;

public class RotateNXNMatrix {
    public static void main(String[] args) {
        int n = 5;

        int[][] arr = create2DMatrixOf(n);
        System.out.println(" -------------- Before ----------------");
        print(arr);
        System.out.println(" -------------- After 90 Degree----------------");
        arr =  rotate90Clockwise(arr);
        print(arr);
        System.out.println(" -------------- After 180 Degree ----------------");
        arr =  rotate90Clockwise(arr);
        print(arr);
        System.out.println(" -------------- After 270 Degree ----------------");
        arr =  rotate90Clockwise(arr);
        print(arr);
        System.out.println(" -------------- Back to Original i.e. 360 Degree----------------");
        arr =  rotate90Clockwise(arr);
        print(arr);
    }

    private static int[][] rotate90Clockwise(int[][] arr) {
        int[][] newArr = new int[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j >= 0; j--) {
                newArr[i][Math.abs(j-arr.length + 1)] = arr[j][i];
            }
        }
        return newArr;
    }

    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }

    private static int[][] create2DMatrixOf(int n) {
        int count = 1;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = count++;
            }
        }
        return arr;
    }
}
