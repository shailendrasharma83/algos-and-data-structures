package sorting;

//0, 1, 1, 2, 3, 5, 8, 13, 21, 34

public class RecursionFibonacci {
    public static void main(String[] args) {

        int max = 6;
        for (int i = 0; i < max; i++) {
            System.out.println(RecursionFibonacci.fibonacciRecursion(i));
        }
    }


    private static int fibonacciRecursion(int size) {
        if (size == 0) {
            return 0;
        }

        if (size == 1 || size == 2) {
            return 1;
        }

        return fibonacciRecursion(size - 2) + fibonacciRecursion(size - 1);
    }
}
