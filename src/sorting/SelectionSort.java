package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] intArray = new int[]{44, 34, 54, 12, 7, 22, 1};
        int largestIndex;
        for (int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            largestIndex = 0;
            for (int firstUnsortedIndex = 1; firstUnsortedIndex <= lastUnsortedIndex; firstUnsortedIndex++) {
                 if(intArray[firstUnsortedIndex] > intArray[largestIndex]) {
                     largestIndex = firstUnsortedIndex;
                 }
            }
            swap(intArray, largestIndex, lastUnsortedIndex);
            printArrray(intArray);
        }
        printArrray(intArray);



    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    private static void printArrray(int[] arr) {
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
        System.out.println(" ");
    }
}
