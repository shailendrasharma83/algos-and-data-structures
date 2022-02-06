package arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 8, 9, 10};
        findMissingNumber(arr);
    }

    public static void findMissingNumber(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] != i+1) {
                System.out.print(i+1);
                return;
            }
        }
    }
}
