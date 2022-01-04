package sorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = new int[]{72, 34, 54, 12, 7, 22, 1};

        for (int unsortedIndex = intArray.length - 1; unsortedIndex > 0; unsortedIndex--) {

            for (int indexFromLeft = 0; indexFromLeft < unsortedIndex; indexFromLeft++) {
                if (intArray[indexFromLeft] > intArray[indexFromLeft + 1]) {
                    swap(intArray, indexFromLeft, indexFromLeft + 1);
                }
            }
        }
        printArrray(intArray);
    }

    static void swap(int[] arr, int indexI, int indexJ) {
        int temp = arr[indexI];
        arr[indexI] = arr[indexJ];
        arr[indexJ] = temp;
    }

    private static void printArrray(int[] arr) {
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
    }
}
