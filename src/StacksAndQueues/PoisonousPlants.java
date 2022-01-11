package StacksAndQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PoisonousPlants {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 6, 2, 7, 5);
        poisonousPlants(list);
    }

    public static int poisonousPlants(List<Integer> p) {
        Integer[] ts = new Integer[p.size()];
        p.toArray(ts);
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i < ts.length; i++) {
            if (i + 1 > ts.length - 1) {
                temp.add(ts[i]);
                break;
            }

            if (ts[i] < ts[i + 1]) {
                temp.add(ts[i]);
            } else {
                temp.add(ts[i]);
                temp.add(ts[i + 1]);
            }
            i++;
        }
        printArrray(temp);
        return 1;
    }

    private static void printArrray(List<Integer> arr) {
        for (int t = 0; t < arr.size(); t++) {
            System.out.print(arr.get(t) + " ");
        }
    }
}
