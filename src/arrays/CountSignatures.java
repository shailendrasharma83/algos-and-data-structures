package arrays;

import sorting.PrintUtils;

public class CountSignatures {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        int[] signatureCounts = new CountSignatures().findSignatureCounts(arr);
        PrintUtils.printArray(signatureCounts);
    }

    int[] findSignatureCounts(int[] arr) {
        int[] signatureCounts = new int[arr.length];
       //TODO
        return signatureCounts;
    }
}

