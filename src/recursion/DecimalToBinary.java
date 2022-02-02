package recursion;

public class DecimalToBinary {

    public static void main(String[] args) {
        System.out.println(binary(15));
        System.out.println(binaryAsString(15));
    }

    private static int binary(int number) {
        if (number == 0) {
            return number;
        }
        return number % 2 + 10 * binary(number / 2);
    }

    private static String binaryAsString(int number) {
        if (number == 0) {
            return "";
        }
        return binary(number / 2) + String.valueOf(number % 2);
    }
}
