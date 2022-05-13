package arrays;

import java.util.ArrayList;
import java.util.List;

public class SubArraySum {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(10);

        List<List<Integer>> queries = new ArrayList<>();

        List<Integer> q1 = new ArrayList<>();
        q1.add(1);
        q1.add(2);
        q1.add(10);
        queries.add(q1);

        SubArraySum.findSum(numbers, queries);


    }

    public static List<Long> findSum(List<Integer> numbers, List<List<Integer>> queries) {

        List<Long> res = new ArrayList<>();
        Long sum;
        int min = 0;
        int max = 0;
        int num = 0;
        for (List<Integer> query : queries) {
            sum = 0L;
            min = query.get(0) - 1;
            max = query.get(1) - 1;
            num = query.get(2);
            for (int i = min; i <= max; i++) {
                sum += numbers.get(i) == 0 ? num : numbers.get(i);
            }
            res.add(sum);
        }

        return res;

    }
}
