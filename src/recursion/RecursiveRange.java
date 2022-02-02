package recursion;

public class RecursiveRange {

    public static void main(String[] args) {
        System.out.println(sumOfRange(10));
    }
    private static int sumOfRange(int range) {
        if(range == 0) {
            return 0;
        }
        return range + sumOfRange(--range);
    }
}
