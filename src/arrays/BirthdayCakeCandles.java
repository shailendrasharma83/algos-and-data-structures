package arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(Integer.valueOf(4), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(3));
        System.out.println(birthdayCakeCandles(arr));
    }


    public static int birthdayCakeCandles(List<Integer> candles) {
        Integer max = Collections.max(candles);
        return Collections.frequency(candles, max);

    }
}
