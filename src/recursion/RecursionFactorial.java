package recursion;

public class RecursionFactorial {

    public static void main(String[] args) {
        System.out.println(RecursionFactorial.iterativeFactorial(3));
        System.out.println(RecursionFactorial.recussiveFactorial(3));
    }

//    1! = 0! = 1
//    2! = 2 * 1!
//    3! = 3 * 2!
//    4! = 4 * 3!
//    n! = n * !(n-1)

    private static int iterativeFactorial(int number) {

        if(number == 1) {
            return 1;
        }

        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static int recussiveFactorial(int number) {
        if(number < 0) return -1;

        if(number == 1) {
            return 1;
        }

        return number * recussiveFactorial(number - 1);
    }
}
