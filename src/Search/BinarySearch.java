package Search;

public class BinarySearch {

    public static void main(String[] args) {
        int[] intArray = new int[]{-22, -15, 1, 7, 20, 35, 55, 66};

        search(7, intArray);
    }


    static void search(int item, int[] collection) {
        System.out.println(searchRecussively(item, collection, 0, collection.length));
        System.out.println(searchIteratively(item, collection));
    }

    private static int searchIteratively(int item, int[] collection) {
        int start = 0;
        int end = collection.length;
        int mid;

        while (start < end) {
            mid = (start + end) / 2;

            if (item == collection[mid]) {
                return mid;
            }

            if (item < collection[mid]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int searchRecussively(int item, int[] collection, int start, int end) {
        if (start >= end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (collection[mid] == item) {
            return mid;
        }

        if (item < collection[mid]) {
            end = mid;
        } else {
            start = mid + 1;
        }
        return searchRecussively(item, collection, start, end);
    }
}
