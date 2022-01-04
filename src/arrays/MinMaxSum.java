package arrays;

import java.util.Arrays;
import java.util.List;

public class MinMaxSum {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(Integer.valueOf(256741038), Integer.valueOf(623958417), Integer.valueOf(467905213), Integer.valueOf(714532089), Integer.valueOf(938071625));
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        Long min = Long.valueOf(0);
        Long max = Long.valueOf(0);
        Long result;
        Long[] longArray = new Long[arr.size()];

        for(int index = 0; index<arr.size(); index++) {
            longArray[index] =  Long.valueOf(arr.get(index));
        }

        for (int i = 0; i < longArray.length; i++) {
            result = Long.valueOf(0);
            for (int j = 0; j < longArray.length; j++) {
                if (i != j) {
                    result += longArray[j];
                }
            }
            min = i == 0 ? min = result : Math.min(min, result);
            max = i == 0 ? max = result : Math.max(max, result);
        }

        System.out.println(Long.valueOf(min) + " " + Long.valueOf(max));
    }


}
