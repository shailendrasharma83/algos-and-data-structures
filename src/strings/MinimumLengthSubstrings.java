package strings;

/*
 *You are given two strings s and t. You can select any substring of string s and rearrange the characters of the
 * selected substring. Determine the minimum length of the substring of s such that string t is a substring of the
 *  selected substring.
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MinimumLengthSubstrings {

    public static void main(String[] args) {
        String s_1 = "dcbefebce";
        String t_1 = "fd";

        System.out.println(minLengthSubstring1(s_1, t_1));
//        System.out.println(new MinimumLengthSubstrings().minLengthSubstring(s_1, t_1));

        String s_2 = "bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf";
        String t_2 = "cbccfafebccdccebdd";
//
        System.out.println(new MinimumLengthSubstrings().minLengthSubstring1(s_2, t_2));

        minLengthSubstring1(s_1, t_1);

    }

    static int minLengthSubstring1(String s, String t) {
        HashMap<Character, Integer> mapT = new HashMap();
        HashMap<Character, Integer> mapS = new HashMap();
        char[] charsT = t.toCharArray();

        for (int i = 0; i < charsT.length; i++) {
            if (!mapT.containsKey(charsT[i])) {
                mapT.put(charsT[i], 1);
            } else {
                mapT.put(charsT[i], mapT.get(charsT[i]).intValue() + 1);
            }
        }

        char[] charsS = s.toCharArray();
        for (int j = 0; j < charsS.length; j++) {
            if (!mapT.containsKey(charsS[j])) {
                continue;
            }

            if (!mapS.containsKey(charsS[j])) {
                mapS.put(charsS[j], 1);

            } else {

                mapS.put(charsS[j], mapS.get(charsS[j]).intValue() + 1);
            }

            if (j >= charsT.length && mapS.equals(mapT)) {
                return j+1;
            }
        }


        return -1;
    }

    int minLengthSubstring(String s, String t) {
        int pivot = -1;
        char[] chars = t.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            pivot = Math.max(pivot, s.indexOf(chars[i], i));
        }
        pivot++;
        if (pivot > 0) {
            Set<String> permutations = permutation(s.substring(0, pivot));
            for (String perm : permutations) {
                if (perm.contains(t)) {
                    return pivot;
                }
            }
        }
        return -1;
    }

    public static Set<String> permutation(String str) {
        Set<String> permutations = new HashSet<>();
        permutation("", str, permutations);
        return permutations;
    }

    static void permutation(String prefix, String str, Set<String> permutations) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);
            permutations.add(prefix);
        } else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n), permutations);
        }
    }
}
