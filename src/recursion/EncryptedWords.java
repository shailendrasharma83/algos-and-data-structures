package recursion;

/*
* You've devised a simple encryption method for alphabetic strings that shuffles the characters in such a
*  way that the resulting string is hard to quickly read, but is easy to convert back into the original string.
When you encrypt a string S, you start with an initially-empty resulting string R and append characters to it as follows:
Append the middle character of S (if S has even length, then we define the middle character as the left-most of the
 two central characters)
Append the encrypted version of the substring of S that's to the left of the middle character (if non-empty)
Append the encrypted version of the substring of S that's to the right of the middle character (if non-empty)
* */

public class EncryptedWords {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(new EncryptedWords().findEncryptedWord(str));
        System.out.println(new EncryptedWords().findEncryptedWordIteratively(str));
    }

    String findEncryptedWord(String str) {

        int middle = getMiddle(str);

        StringBuffer sb = new StringBuffer().append(str.charAt(middle));

        return sb.append(findEncryptedWord(str, 0, middle)).toString();
    }

    private int getMiddle(String str) {
        return str.length() % 2 == 0 ? (str.length() / 2) - 1 : str.length() / 2;
    }

    String findEncryptedWord(String str, int start, int end) {
        if (start >= str.length()) {
            return "";
        }

        StringBuffer sb = new StringBuffer();
        for (int i = start; i < end; i++) {
            if (i < str.length()) {
                sb.append(str.charAt(i));
            }
        }
        int newStart = ++end;
        int newEnd = end + end;

        return sb.toString() + findEncryptedWord(str, newStart, newEnd);
    }

    String findEncryptedWordIteratively(String s) {
        int middle = getMiddle(s);
        StringBuffer sb = new StringBuffer().append(s.charAt(middle));
        for (int i = 0; i < middle; i++) {
            sb.append(s.charAt(i));
        }

        for (int j = middle + 1; j < s.length(); j++) {
            sb.append(s.charAt(j));
        }
        return sb.toString();
    }


}
