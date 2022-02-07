package arrays;

public class FirstSecondBestScore {
    public static void main(String[] args) {
        int[] arr = new int[]{84, 85, 86, 87, 85, 90, 85, 83, 23, 45, 84, 1, 2, 0};
        System.out.println(firstSecond(arr));
    }

    static String firstSecond(int[] myArray) {
        int max = 0;
        int secondMax = 0;

        for (int item : myArray) {
            if(max < item) {
                secondMax = max;
                max = item;
            }
        }
      return max + " " + secondMax;
    }
}
