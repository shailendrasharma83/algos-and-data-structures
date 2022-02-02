package recursion;

public class GreatestCommomDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
    }

    private static int gcd(int a, int b) {
        if (a < 0 || b < 0) {
            return -1;
        }

        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
}

