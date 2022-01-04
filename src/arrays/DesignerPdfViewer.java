package arrays;

import java.util.ArrayList;
import java.util.List;

public class DesignerPdfViewer {

    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>();

        int[] intArr = new int[]{1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5};

        for (int i = 0; i < intArr.length; i++) {
            input.add(i, Integer.valueOf(intArr[i]));
        }

        System.out.println(designerPdfViewer(input, "abc"));
    }

    public static int designerPdfViewer(List<Integer> h, String word) {
        String alphabets = "abcdefghijklmnopqrstuvwxyz";
        int maxHeigt = 0;
        char[] c = word.toCharArray();

        for (int i = 0; i < c.length; i++) {
            maxHeigt = Math.max(maxHeigt, h.get(alphabets.indexOf(c[i])));
        }

        return maxHeigt * word.length();

    }
}
