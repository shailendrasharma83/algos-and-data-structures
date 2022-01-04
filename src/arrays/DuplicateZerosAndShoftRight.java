package arrays;

//Given a fixed-length integer array arr, duplicate each occurrence of zero, shifting the remaining elements to the right.
//Note that elements beyond the length of the original array are not written. Do the above modifications to the input array in place and do not return anything.

public class DuplicateZerosAndShoftRight {
    public static void main(String[] args) {
        int[] input = new int[]{0, 0, 0, 0, 0, 0, 0, 0};

        duplicateZeros(input);
    }

    private static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                shiftRight(arr, i);
                i += 1;
            }
        }
        System.out.print("\n ");
        printArrray(arr);

    }

    private static void shiftRight(int[] arr, int index) {
        if (index == arr.length - 1) {
            return;
        }

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index + 1] = 0;
        System.out.print("\nShifting right for :: " +index+" \n " );
        printArrray(arr);
    }

    private static void printArrray(int[] arr) {
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
    }

}
