package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};
        int[] intArray1 = new int[]{2, 1, 2,  5};
        quickSort(intArray, 0, intArray.length);
        quickSort(intArray1, 0, intArray1.length);

        PrintUtils.printArray(intArray);
        PrintUtils.printArray(intArray1);
    }

    private static void quickSort(int[] intArray, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(intArray, start, end);
        quickSort(intArray, start, pivotIndex);
        quickSort(intArray, pivotIndex + 1, end);
    }

    private static int partition(int[] input, int start, int end) {
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j) {
            while (i < j && input[--j] >= pivot) ;
            if (i < j) {
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot) ;
            if (i < j) {
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
    }


}
