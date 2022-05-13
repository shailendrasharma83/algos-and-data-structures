package list;

import java.util.ArrayList;
import java.util.List;

public class MergeSortedLists {

    public static void main(String[] args) {
        List list1 = new ArrayList<>();
        list1.add(5);
        list1.add(7);
        list1.add(9);

        List list2 = new ArrayList<>();
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);

        List merged = merge(list1, list2);
        merged.stream().forEach(integer -> System.out.print(integer +" "));
    }

    private static List merge(List<Integer> list1, List<Integer> list2) {
        if (list1 == null && list2 == null) {
            return null;
        }

        if (list1 == null && list2 != null) {
            return list2;
        }

        if (list1 != null && list2 == null) {
            return list1;
        }

        int h1 = 0;
        int h2 = 0;

        List merged = new ArrayList();

        boolean continueToCompare= true;
        while(continueToCompare) {
            if(list1.get(h1) < list2.get(h2)) {
                merged.add(list1.get(h1));
                h1 = Math.min(h1+1, list1.size()-1);
            } else {
                merged.add(list2.get(h2));
                h2= Math.min(h2+1, list2.size()-1);
            }

            if(h1 == list1.size()-1 &&  h2 == list2.size()-1) {
                continueToCompare = false;
            }
        }

        System.out.println(h1 + "  " + h2 );
        return merged;
    }


}
