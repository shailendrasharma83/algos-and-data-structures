package strings;

/*
* There is a sequence of words in CamelCase as a string of letters, , having the following properties:

It is a concatenation of one or more words consisting of English letters.
All letters in the first word are lowercase.
For each of the subsequent words, the first letter is uppercase and rest of the letters are lowercase.
Given , determine the number of words in .
*
* https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
* */

public class Camelcase {
    public static void main(String[] args) {
        System.out.println(camelcase("oneTwoThreeFour"));
    }

    public static int camelcase(String s) {
        if(s.isEmpty()) {
            return 0;
        }
        int count = 1;

        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
          if(Character.isUpperCase(array[i])) count++;
        }

        return count;
    }
}
