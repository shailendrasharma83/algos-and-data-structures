package arrays;

import java.util.Arrays;

public class SquaresofSortedArray {

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    private static void printArrray(int[] arr) {
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
    }

    public static void main(String[] args) {
//        printArrray(sortedSquares(new int[] {-4,-1,0,3,10}));
        int[] temp = new int[2];
//        temp[0] = 1;
        printArrray(temp);

    }
}
