package list;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Before :: ");
        list.stream().forEach(integer -> System.out.print(integer +" "));

        Set set = new HashSet(list);

        list = new ArrayList<>(set);
        System.out.println("\nAfter :: ");
        list.stream().forEach(integer -> System.out.print(integer +" "));

    }



    }

