package arrays;

public class FindEvenNumberofDigits {

    static int countLength(int n)
    {
        int cnt = 0;
        while(n > 0)
        {
            n /= 10;
            cnt++;
        }
        return cnt;
    }

    public static int findNumbers(int[] nums) {
        int count = 0;

        for(int num : nums) {
            if(countLength(num)%2 == 0) count++;
        }
        return count;
    }


    public static void main(String[] args) {
        System.out.println("" + findNumbers(new int[] {7896}));
    }
}
