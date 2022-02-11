package sorting;

import java.util.Arrays;

/*
* Given an array of integers (which may include repeated integers), determine if there's a way to split the array into two subsequences A and B such that the sum of the integers in both arrays is the same, and all of the integers in A are strictly smaller than all of the integers in B.
Note: Strictly smaller denotes that every integer in A must be less than, and not equal to, every integer in B.
* */
public class BalancedSplit {

    public static void main(String[] args) {
        int[] arr = new int[] {2,1,2,5};
        int[] arr1 = new int[]{3, 6, 3, 4, 4};
        quickSort(arr, 0, arr.length);
        quickSort(arr1, 0, arr1.length);
        System.out.println(balancedSplitExists(arr));
        System.out.println(balancedSplitExists(arr1));
    }

    static boolean balancedSplitExists(int[] arr) {

        int pivot = arr.length - 1;

        return split(arr, pivot, 0, 0);

    }

    static boolean split(int[] arr, int pivot, int leftSum, int rightSum) {

        if (leftSum == rightSum && leftSum != 0 && rightSum != 0) {
            return true;
        }

        if(pivot == 0) {
            return false;
        }

        int nextElementToMoveRight = arr[pivot];

        while (nextElementToMoveRight == arr[pivot] && pivot > 0) {
            pivot--;
        }
        rightSum = sum(Arrays.copyOfRange(arr, pivot+1, arr.length));
        leftSum = sum(Arrays.copyOfRange(arr, 0, pivot+1));
        return split(arr, pivot, leftSum, rightSum);
    }

    private static int sum(int[] arr) {
        return Arrays.stream(arr).reduce(0, (left, right) -> left + right);
    }

    private static void quickSort(int[] arr, int start, int end) {

        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(arr, start, end);
        quickSort(arr, start, pivotIndex);
        quickSort(arr, pivotIndex + 1, end);

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
