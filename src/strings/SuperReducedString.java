package strings;

/*
Reduce a string of lowercase characters in range ascii[‘a’..’z’]by doing a series of operations. In each operation, select a pair of adjacent letters that match, and delete them.

Delete as many characters as possible using this method and return the resulting string. If the final string is empty, return Empty String
* */
public class SuperReducedString {

    public static void main(String[] args) {
        System.out.println(superReducedString("aaabccddd"));
    }

    public static String superReducedString(String s) {
        char[] input = s.toCharArray();
        if (exitCondition(input)) {
            return s.trim().length() == 0 ? "Empty String" : s;
        }
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < input.length; i++) {
            if (input[i] == input[i + 1]) {
                sb.append(s, 0, i).append(s.substring(i + 2));
                break;
            }
        }
        return superReducedString(sb.toString());
    }

    static boolean exitCondition(char[] input) {
        for (int i = 0; i < input.length - 1; i++) {
            if (input[i] == input[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
