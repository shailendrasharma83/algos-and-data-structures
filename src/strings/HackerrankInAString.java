package strings;

public class HackerrankInAString {

    public static void main(String[] args) {
        System.out.println(hackerrankInString("knarrekcah"));
    }

    public static String hackerrankInString(String s) {
        String code = "hackerrank";
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == code.charAt(counter)) {
                counter++;
            }
        }
        return counter == code.length() ? "YES": "NO";

    }
}






