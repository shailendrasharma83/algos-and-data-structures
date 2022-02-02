package recursion;

public class ProductofArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        System.out.println(product(arr, arr.length - 1));
    }

    private static int product(int arr[], int N) {
        if (N < 0) {
            return 1;
        }
        return arr[N] * product(arr, --N);
    }
}
