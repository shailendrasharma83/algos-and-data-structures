package StacksAndQueues;

import java.util.Deque;
import java.util.LinkedList;

public class BalancedBrackets {

    public static void main(String[] args) {
        System.out.println(isBalancedUsingQueue("}][}}(}][))]"));
    }

    public static String isBalancedUsingQueue(String s) {
        if (s.length() % 2 != 0) {
            return "NO";
        }

        Deque<Character> queue = new LinkedList();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
                queue.addFirst(ch[i]);
            } else if (!queue.isEmpty() && ((queue.peekFirst() == '{' && ch[i] == '}')
                    || (queue.peekFirst() == '(' && ch[i] == ')')
                    || (queue.peekFirst() == '[' && ch[i] == ']'))) {
                queue.removeFirst();
            } else {
                return "NO";
            }
        }
        return "YES";
    }


}
