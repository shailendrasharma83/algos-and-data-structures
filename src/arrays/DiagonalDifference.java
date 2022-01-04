package arrays;

import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {

    public static void main(String[] args) {

        List<List<Integer>> table = Arrays.asList(Arrays.asList(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(8)),
                Arrays.asList(Integer.valueOf(4), Integer.valueOf(5), Integer.valueOf(6)),
                Arrays.asList(Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(9)));

        diagonalDifference(table);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {


        Integer[][] squareArray = new Integer[arr.size()][];
        Integer diagonalLeft = 0;
        Integer diagonalRight = 0;

        for (int i = 0; i < arr.size(); i++) {
            squareArray[i] = arr.get(i).toArray(new Integer[0]);
        }

        for (int row = 0; row < squareArray.length; row++) {
            for (int col = 0; col < squareArray[row].length; col++) {
                if (row == col) diagonalLeft += squareArray[row][col];
                if (row + col == squareArray.length - 1) diagonalRight += squareArray[row][col];
            }
        }
        return Math.abs(diagonalRight - diagonalLeft);
    }
}
