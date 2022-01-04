package sorting;

public class InsertionSort {


    public static void main(String[] args) {
        int[] intArray = new int[]{20, 35, -15, 7, 55, 1, -22};

        int sortedIndex = 0;
        int testElement;
        for (int unSortedIndex = sortedIndex + 1; unSortedIndex < intArray.length; unSortedIndex++) {
            testElement = intArray[unSortedIndex];

            for (int j = sortedIndex; j >= 0; j--) {
                if (testElement < intArray[j]) {
                    intArray[j + 1] = intArray[j];
                    intArray[j] = testElement;
                }
            }

            sortedIndex++;
        }

        printArrray(intArray);
    }

    private static void printArrray(int[] arr) {
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
        System.out.println(" ");
    }
}