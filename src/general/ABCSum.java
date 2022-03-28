package general;
/*
* Given three integers AA, BB, and CC, determine their sum.
Your task is to implement the function getSum(A, B, C) which returns the sum A + B + CA+B+C.
* */
public class ABCSum {

    public static void main(String[] args) {
        System.out.println(new ABCSum().getSum(1,2,3));
    }

    public int getSum(int A, int B, int C) {
        // Write your code here
        return A+B+C;
    }

}
