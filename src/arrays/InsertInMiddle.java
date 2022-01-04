package arrays;

public class InsertInMiddle {

    public static void main(String[] args) {
        int[] arr = new int[7];
        populate(arr);
        insert(22, 1, arr);

    }

    private static void insert(int element, int index, int[] arr) {
        printArrray(arr);
        System.out.println("\n");
        if (index > arr.length - 1) {
            System.out.println("Index out of bound");
        } else if (index == arr.length - 1) {
            arr[index] = element;
        } else {

            for(int i = arr.length-1; i >= index; i--) {
                arr[i] = arr[i-1];
            }
            arr[index]= element;
            printArrray(arr);

        }
    }

    private static void printArrray(int[] arr) {
        for (int t = 0; t < arr.length; t++) {
            System.out.print(arr[t] + " ");
        }
    }

    private static void populate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }
}
