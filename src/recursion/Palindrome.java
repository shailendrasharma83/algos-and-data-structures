package recursion;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";

        System.out.println("Iteratively :: " + checkIfPalindromeIteratively(str));
        System.out.println("Recursively :: " + checkIfPalindromeRecursively(str));
    }

    private static boolean checkIfPalindromeIteratively(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(str.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    private static boolean checkIfPalindromeRecursively(String str) {
        return validatePalindromeString(str, 0, str.length() - 1);

    }

    private static boolean validatePalindromeString(String str, int i, int j) {
        if (i > j) {
            return true;
        }

        if (Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(str.charAt(j))) {
            return false;
        }
        return validatePalindromeString(str, ++i, --j);
    }
}
