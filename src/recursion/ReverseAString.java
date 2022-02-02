package recursion;

public class ReverseAString {
    public static void main(String[] args) {
        System.out.println(reverse("Testing"));
    }

    private static String reverse(String stringToReverse) {
        return reverse(stringToReverse, stringToReverse.length() - 1);
    }

    private static String reverse(String stringToReverse, int index) {
        if (index < 0) {
            return "";
        }

        return stringToReverse.charAt(index) + reverse(stringToReverse, --index);
    }
}
