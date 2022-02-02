package recursion;

public class CapitalizeWord {

    public static void main(String[] args) {
        String str = "i am $lways angry.";
        System.out.println(capitalize(str, 0));

    }

    private static String capitalize(String str, int index) {
        String[] splited = str.split(" ");
        if (index >= splited.length) {
            return "";
        }
        char[] sub = splited[index].toCharArray();
        if (isAChar(sub[0])) {
            sub[0] = Character.toUpperCase(sub[0]);
        }
        return String.valueOf(sub) + " " + capitalize(str, ++index);
    }

    private static boolean isAChar(char ch) {
        return ('a' <= ch && ch >= 'z') || ('A' <= ch && ch >= 'Z');
    }
}
