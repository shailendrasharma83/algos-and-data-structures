package arrays;

import java.util.Arrays;
import java.util.List;

public class LeftRotation {

    public static void main(String[] args) {
        rotLeft(Arrays.asList(1, 2, 3, 4, 5), 2);
    }

    public static List<Integer> rotLeft(List<Integer> a, int d) {
        Integer[] arr = a.toArray(new Integer[a.size()]);
        Integer[] tempArr = Arrays.copyOfRange(arr, 0, d);

        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }

        for (int j = 0; j < d; j++) {
            arr[j + arr.length - d] = tempArr[j];
        }

        return Arrays.asList(arr);
    }

    // To print an array
    static void printArray(Integer arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }
}
