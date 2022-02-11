package sorting;

import static sorting.PrintUtils.printArray;

public class InsertionSort1 {

    public static void main(String[] args) {

        int[] intArray = new int[]{72, 34, 54, 12, -7, 22, 1};
        System.out.println("------------Before------------------");
        printArray(intArray);
        System.out.println("\n------------After------------------");
        printArray(insertionSort(intArray));
    }

    private static int[] insertionSort(int[] arr) {
        int sortedIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            int tempElement = arr[i];
            for (int j = sortedIndex; j >= 0; j--) {
                if (tempElement < arr[j]) {
                    arr[j + 1] = arr[j];
                    arr[j] = tempElement;
                }
            }
            sortedIndex++;
        }
        return arr;
    }
}
