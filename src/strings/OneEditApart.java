// Write a function that returns whether two words are exactly "one edit" away using the following signature:
package strings;

import static java.lang.Math.abs;

public class OneEditApart {

    public static void main(String[] args) {
        System.out.println(new OneEditApart().validate("cat", "dog"));
        System.out.println(new OneEditApart().validate("cat", "cats"));
        System.out.println(new OneEditApart().validate("cat", "cut"));
        System.out.println(new OneEditApart().validate("cat", "cast"));
        System.out.println(new OneEditApart().validate("cat", "at"));
        System.out.println(new OneEditApart().validate("cat", "act"));
    }

    private boolean validate(String str1, String str2) {
        if (abs(str1.length() - str2.length()) > 1) {
            return false;
        }

        if (str2.length() > str1.length()) {
            String temp = str2;
            str2 = str1;
            str1 = temp;
        }

        if (diffFromFrowardComparison(str1, str2) || diffFromReverseComparison(str1, str2)) {
            return true;
        }

        return false;
    }

    private boolean diffFromReverseComparison(String str1, String str2) {
        int diffFromReverseComparison = 0;
         str1 = reverse(str1);
         str2 = reverse(str2);

        for (int j = (str2.length() - 1); j >= 0; j--) {
            if (str1.charAt(j) != str2.charAt(j)) {
                diffFromReverseComparison++;
            }
        }

        if (diffFromReverseComparison > 1) {
            return false;
        }
        return true;
    }

    private String reverse(String str) {
        return new StringBuffer(str).reverse().toString();
    }

    private boolean diffFromFrowardComparison(String str1, String str2) {
        int diffFromFrowardComparison = 0;

        for (int i = 0; i < str1.length() - 1; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                diffFromFrowardComparison++;
            }
        }

        if (diffFromFrowardComparison > 1) {
            return false;
        }
        return true;
    }


}
