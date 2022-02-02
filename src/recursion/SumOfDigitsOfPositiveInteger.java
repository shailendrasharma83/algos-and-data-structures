package recursion;

public class SumOfDigitsOfPositiveInteger {

    public static void main(String[] args) {
        int number = 1234;
        System.out.println(sumOfDigits(number));
    }

    private static int sumOfDigits(int number) {
        if (number <= 0) {
            return 0;
        }
        return number % 10 + sumOfDigits(number / 10);
    }
}
