package recursion;

public class FirstUppercase {

    public static void main(String[] args) {
        System.out.println(first("ancDef"));
        System.out.println(first("abcdef"));
        System.out.println(first("ABCDEF"));
    }

    private static char first(String str) {
        return first(str, 0);
    }

    private static char first(String str, int index) {
        if (index >= str.length()) {
            return '!';
        }

        if (Character.isUpperCase(str.charAt(index))) {
            return str.charAt(index);
        }

        return first(str, ++index);
    }
}
