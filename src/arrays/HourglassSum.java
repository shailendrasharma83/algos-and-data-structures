package arrays;

//https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HourglassSum {

    public static void main(String[] args) {
        List<List<Integer>> list = new ArrayList();
        list.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        list.add(Arrays.asList(0, 1, 0, 0, 0, 0));
        list.add(Arrays.asList(1, 1, 1, 0, 0, 0));
        list.add(Arrays.asList(8, 9, 2, -4, -4, 0));
        list.add(Arrays.asList(0, 0, 0, -2, 0, 0));
        list.add(Arrays.asList(0, 0, -1, -2, -4, 0));

        System.out.println(HourglassSum.hourglassSum(list));
    }

    public static int hourglassSum(List<List<Integer>> list) {
        int sum = 0;
        Integer tempSum = 0;
        Integer[][] matrix = new Integer[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            matrix[i] = list.get(i).toArray(new Integer[0]);
        }


        for (int i = 0; i < matrix.length - 2; i++) {
            for (int j = 0; j < matrix[i].length - 2; j++) {
                tempSum = matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2] +
                        matrix[i + 1][j + 1] +
                        matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2];

                sum = Math.max(sum, tempSum);
            }
        }

        return sum;
    }

}

