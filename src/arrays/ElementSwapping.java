/*
*Given a sequence of n integers arr, determine the lexicographically smallest sequence which may be obtained from it after performing at most k element swaps, each involving a pair of consecutive elements in the sequence.
Note: A list x is lexicographically smaller than a different equal-length list y if and only if, for the earliest index at which the two lists differ, x's element at that index is smaller than y's element at that index.

* Find the min element upto start + k index of array and do k swaps to make array more lexographic.
* * */
package arrays;

import sorting.PrintUtils;

public class ElementSwapping {

    public static void main(String[] args) {
        int k_1 = 2;
        int[] arr_1 = {5, 3, 1};
        PrintUtils.printArray(new ElementSwapping().findMinArray(arr_1, k_1));
    }


    int[] findMinArray(int[] arr, int k) {
        int minIndex = findMinIndex(arr, k);
        for (int i = minIndex; i > 0; i--) {
            if (k > 0) {
                swap(arr, i, i - 1);
                k--;
            }
        }
        return arr;

    }

    static int findMinIndex(int[] arr, int k) {
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for (int i = 0; i <= k; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
