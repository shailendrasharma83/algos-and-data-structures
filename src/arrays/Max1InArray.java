package arrays;

public class Max1InArray {
    public int findMaxConsecutiveOnes(int[] nums) {

        int output= 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0) {
                System.out.println("Reset :: " + count);
                count = 0;
            } else {
                count++;
                output = Math.max(output, count);
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int[] input = new int[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.printf(" "+ new Max1InArray().findMaxConsecutiveOnes(input));
    }
}
