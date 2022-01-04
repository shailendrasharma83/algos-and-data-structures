package arrays;

import java.util.Arrays;
import java.util.List;

public class VeryBigSum {

    public static void main(String[] args) {
        List<Long> list = Arrays.asList(Long.valueOf(1000000001), Long.valueOf(1000000002),
                Long.valueOf(1000000003), Long.valueOf(1000000004), Long.valueOf(1000000005));

        System.out.println(aVeryBigSum(list));
   }

    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream().reduce(Long.valueOf(0), (Long aLong, Long aLong1) -> aLong + aLong1);

    }
}
