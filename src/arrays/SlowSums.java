package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SlowSums {

    public static void main(String[] args) {
        int[] arr_1 = {4, 2, 1, 3};
        System.out.println(new SlowSums().getTotalTime(arr_1));
    }

    int getTotalTime(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int item : arr) {
            list.add(Integer.valueOf(item));

        }
        return total(list, 0);
    }

    int total(List<Integer> list, int penalty) {
        if (list.size() == 1) {
            return penalty;
        }

        Collections.sort(list);
        int newPenalty = list.remove(list.size() - 1) + list.remove(list.size() - 1);
        list.add(newPenalty);

        return total(list, penalty + newPenalty);
    }
}
