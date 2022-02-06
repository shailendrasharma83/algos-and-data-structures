package arrays;

//Write a program to find all pair of int whose sum is equal to a given number
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        find(nums, 9);
    }

    public static int[] find(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    System.out.println("found :: " + i + " -  " + j);
                    return new int[]{i, j};
                }
            }

        }
        return new int[0];
    }
}
