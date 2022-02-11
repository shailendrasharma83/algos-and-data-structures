package sorting;

import static sorting.PrintUtils.printArray;

public class SelectionSort1 {
    public static void main(String[] args) {

        int[] intArray = new int[]{1, 34, 54, 12, -7, 22, 72};
        System.out.println("------------Before------------------");
        printArray(intArray);
        System.out.println("\n------------After------------------");
        printArray(selectionSortReverseOrder(intArray));
        System.out.println("\n----After in reverse order---------");
        printArray(selectionSortReverseOrder(intArray));
    }

    private static int[] selectionSort(int[] arr) {
        int sortedIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = sortedIndex; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            swap(arr, sortedIndex, minIndex);
            sortedIndex++;
        }
        return arr;
    }

    private static int[] selectionSortReverseOrder(int[] arr) {
        int sortedIndex = arr.length - 1;
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            maxIndex = 0 ;
            for (int j = 0; j <= sortedIndex; j++) {

                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }
            swap(arr, sortedIndex--, maxIndex);
        }
        return arr;
    }


    private static void swap(int[] arr, int i, int j) {
        if(i==j) {
            return;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
