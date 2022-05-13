package HashTable;

public class CardPairs {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 1, 4, 5, 8};
        int target = 6;
        System.out.println(findPairsWithArrays(arr, target));
    }

    private static int findPairsWithArrays(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    count++;
                }
            }
        }
        return count;
    }

    private static int findPairsWithHashtable(int[] arr, int target) {
        int count = 0;


        return count;
    }


}