package arrays;

// check if two arrays are permutation of each other;

public class Permutation {

    public static void main(String[] args) {
        int[] first = new int[]{1, 2, 3, 4, 5, 6};
        int[] second = new int[]{5, 2, 6, 4, 1, 3};
        System.out.println(vaidate(first, second));
    }

    private static boolean vaidate(int[] first, int[] second) {
        if (isSumEqual(first, second) && isProductEqual(first, second)) {
            return true;
        }
        return false;
    }

    private static boolean isProductEqual(int[] first, int[] second) {
        return product(first) == product(second);
    }

    private static boolean isSumEqual(int[] first, int[] second) {
        return sum(first) == sum(second);
    }

    private static int sum(int[] arr) {
        int sum = 0;

        for (int elem : arr) {
            sum += elem;
        }
        return sum;
    }

    private static int product(int[] arr) {
        int prod = 1;

        for (int elem : arr) {
            prod *= elem;
        }
        return prod;
    }
}
