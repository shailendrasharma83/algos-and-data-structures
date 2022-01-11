/*
* You have an empty sequence, and you will be given  queries. Each query is one of these three types:

1 x  -Push the element x into the stack.
2    -Delete the element present at the top of the stack.
3    -Print the maximum element in the stack.
* https://www.hackerrank.com/challenges/maximum-element/problem?isFullScreen=true
* */

package StacksAndQueues;

import java.util.Arrays;
import java.util.List;

public class MaximumElement {

    public static void main(String[] args) {
        List list = Arrays.asList("4", "1 83", "3", "2", "1 76");
        getMax(list);
    }

    public static List<Integer> getMax(List<String> operations) {
        String[] temp;
        Stack stack = new Stack();

        for (String str : operations) {
            temp = str.split(" ");

            if (Integer.valueOf(temp[0]) == 1) {
                stack.push(Integer.valueOf(temp[1]));
                continue;
            }

            if (Integer.valueOf(temp[0]) == 2) {
                stack.pop();
                continue;
            }

            if (Integer.valueOf(temp[0]) == 3) {
                System.out.println(stack.max());
                continue;
            }
        }
        return Arrays.asList(stack.get());
    }
}
