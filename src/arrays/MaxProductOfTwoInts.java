package arrays;

import static java.lang.Math.*;

public class MaxProductOfTwoInts {

    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 15};
        System.out.println(maxProduct(arr));
    }

    private static int maxProduct(int[] arr) {
        int max = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                max = max(max, arr[i] * arr[j]);
            }
        }

        return max;
    }


}
