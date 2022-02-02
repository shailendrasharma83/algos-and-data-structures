package recursion;

public class PowerOfANumber {

    public static void main(String[] args) {
        int number = 2;
        int power = 5;

        System.out.println(powerOf(number, power));
    }

    public static int powerOf(int base, int power) {
        if (power == 0) {
            return 1;
        }
        return base * powerOf(base, power - 1);
    }
}
