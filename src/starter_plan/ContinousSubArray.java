package starter_plan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContinousSubArray {

    int[] countSubarrays(int[] arr) {
        int[] output = new int[arr.length];
        for (int index = 0; index < arr.length; index++) {

            output[index] += getSubArrayCount(arr, index);
        }
        return output;
    }

    private int getSubArrayCount(int[] arr, int index) {
        int left = calculateSubArraysOnLeft(arr, index);
        int right = calculateSubArraysOnRight(arr, index);
        System.out.println("For index  " + index + "  ::  " + (left + right));

        return left + right;
    }

    private int calculateSubArraysOnLeft(int[] arr, int index) {
        List<int[]> subArraysOnLeft = new ArrayList<>();
        for (int i = index; i >= 0; i--) {
            if (arr[i] > arr[index]) {
                break;
            }
            subArraysOnLeft.add(Arrays.copyOfRange(arr, i, index));
        }

        subArraysOnLeft.stream().forEach(ints -> {
            printArrray(ints);
        });
        return subArraysOnLeft.size();
    }

    private int calculateSubArraysOnRight(int[] arr, int index) {
        List<int[]> subArraysOnRight = new ArrayList<>();
        for (int i = index; i < arr.length; i++) {

            if (i == index) {
                continue;
            }

            if (arr[i] > arr[index]) {
                break;
            }
            subArraysOnRight.add(Arrays.copyOfRange(arr, index, i));
        }

        subArraysOnRight.stream().forEach(ints -> {
            printArrray(ints);
        });
        return subArraysOnRight.size();
    }

    private static void printArrray(int[] arr) {
        for (int t = 0; t < arr.length; t++) {
            System.out.println(Arrays.toString(arr));
        }
    }

    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom.
    int test_case_number = 1;

    void check(int[] expected, int[] output) {
        int expected_size = expected.length;
        int output_size = output.length;
        boolean result = true;
        if (expected_size != output_size) {
            result = false;
        }
        for (int i = 0; i < Math.min(expected_size, output_size); i++) {
            result &= (output[i] == expected[i]);
        }
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printIntegerArray(expected);
            System.out.print(" Your output: ");
            printIntegerArray(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printIntegerArray(int[] arr) {
        int len = arr.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }

    public void run() {
        int[] test_1 = {3, 4, 1, 6, 2};
        int[] expected_1 = {1, 3, 1, 5, 1};
        int[] output_1 = countSubarrays(test_1);
        check(expected_1, output_1);

        int[] test_2 = {2, 4, 7, 1, 5, 3};
        int[] expected_2 = {1, 2, 6, 1, 3, 1};
        int[] output_2 = countSubarrays(test_2);
        check(expected_2, output_2);

//         Add your own test cases here

    }

    public static void main(String[] args) {
        new ContinousSubArray().run();
    }

}
