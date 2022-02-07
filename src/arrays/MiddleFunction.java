package arrays;

import java.util.Arrays;

public class MiddleFunction {

    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,4};
        printArray(middle(arr));

    }

    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
