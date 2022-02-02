package recursion;

public class SomeRecursive {

    public static void main(String[] args) {
        OddFunction odd = (a) -> a % 2 != 0;

        System.out.println(someRecursive(new int[]{1, 2, 3, 4}, odd));
        System.out.println(someRecursive(new int[]{4, 6, 8, 9}, odd));
        System.out.println(someRecursive(new int[]{4, 6, 8}, odd));
    }

    public static boolean someRecursive(int[] arr, OddFunction odd) {
        return validate(arr, 0, odd);

    }

    private static boolean validate(int[] arr, int index, OddFunction odd) {
        if (index >= arr.length) {
            return false;
        }
        if (odd.isOdd(arr[index])) {
            return true;
        }

        return validate(arr, ++index, odd);
    }
}

interface OddFunction {
    boolean isOdd(int number);
}

