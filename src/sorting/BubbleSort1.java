package sorting;

import static sorting.PrintUtils.printArray;

public class BubbleSort1 {

    public static void main(String[] args) {

        int[] intArray = new int[]{72, 34, 54, 12, 7, 22, 1};
        System.out.println("------------Before------------------");
        printArray(intArray);
        System.out.println("\n------------After------------------");
        printArray(bubbleSort(intArray));
    }

    private static int[] bubbleSort(int[] arr) {

        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
