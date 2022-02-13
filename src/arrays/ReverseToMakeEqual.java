package arrays;

public class ReverseToMakeEqual {

    public static void main(String[] args) {
        int[] arrayA = {1, 2, 3, 4};
        int[] arrayB = {1, 4, 3, 5};
        System.out.println(new ReverseToMakeEqual().areTheyEqual(arrayA, arrayB));


    }

    boolean areTheyEqual(int[] array_a, int[] array_b) {

        if (array_a.length != array_b.length) {
            return false;
        }

        //Find pivot for reversing
        int pivot = 0;
        while (pivot < array_a.length) {
            if (array_a[pivot] == array_b[pivot]) {
                pivot++;
            } else {
                break;
            }
        }

        //Reverse the array
        if (pivot != array_b.length - 1) {
            int j = array_b.length - 1;
            for (int i = pivot; i < j; i++, j--) {
                int temp = array_b[i];
                array_b[i] = array_b[j];
                array_b[j] = temp;
            }
        }

        //Compare post reversal
        for (int k = 0; k < array_a.length; k++)
            if (array_a[k] != array_b[k])
                return false;

        return true;
    }
}
