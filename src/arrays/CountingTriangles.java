
package arrays;

/*
 * Given a list of N triangles with integer side lengths, determine how many different triangles there are.
 * Two triangles are considered to be the same if they can both be placed on the plane such that their vertices occupy
 *  exactly the same three points.
 * */

import java.util.ArrayList;
import java.util.List;

public class CountingTriangles {

    public static void main(String[] args) {
        List<Sides> list = new ArrayList<>();
        list.add(new Sides(2, 2, 3));
        list.add(new Sides(3, 2, 2));
        list.add(new Sides(2, 5, 6));


        System.out.println(" No Of Triangles :: " + new CountingTriangles().countDistinctTriangles((ArrayList<Sides>) list));


        List<Sides> list1 = new ArrayList<>();
        list1.add(new Sides(8, 4, 6));
        list1.add(new Sides(100, 101, 102));
        list1.add(new Sides(84, 93, 173));
        System.out.println(" No Of Triangles :: " + new CountingTriangles().countDistinctTriangles((ArrayList<Sides>) list1));

        ArrayList<Sides> arr_1 = new ArrayList<>();
        arr_1.add(new Sides(7, 6, 5));
        arr_1.add(new Sides(5, 7, 6));
        arr_1.add(new Sides(8, 2, 9));
        arr_1.add(new Sides(2, 3, 4));
        arr_1.add(new Sides(2, 4, 3));
        System.out.println(" No Of Triangles :: " + new CountingTriangles().countDistinctTriangles((ArrayList<Sides>) arr_1));
    }

    int countDistinctTriangles(ArrayList<Sides> arr) {

        if (arr.size() == 0) {
            return 0;
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (validateIfSame(arr.get(i), arr.get(j))) {
                   arr.remove(j);
                }
            }

        }
        return arr.size();
    }

    private static boolean validateIfSame(Sides first, Sides second) {
        if (isSumEqual(first, second) && isProductEqual(first, second)) {
            return true;
        }
        return false;
    }

    private static boolean isProductEqual(Sides first, Sides second) {
        return product(first) == product(second);
    }

    private static boolean isSumEqual(Sides first, Sides second) {
        return sum(first) == sum(second);
    }

    private static int sum(Sides side) {
        return side.a + side.b + side.c;
    }

    private static int product(Sides side) {
        return side.a * side.b * side.c;
    }

}


class Sides {
    int a;
    int b;
    int c;

    Sides(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return a + ", " + b + ", " + c;
    }
}