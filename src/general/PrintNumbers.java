package general;

/*Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the
number and for the multiples of five print “Buzz”. For
numbers which are multiples of both three and five print
“FizzBuzz”.*/

public class PrintNumbers {
    public static void main(String[] args) {
        new PrintNumbers().print(1, 10);
    }

    private void print(int min, int max) {
        for (int i = min; i <= max; i++) {
            if (i % 3 == 0) {
                System.out.print(" Fizz ");
            } else if (i % 5 == 0) {
                System.out.print(" Buzz ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(" FizzBuzz ");
            } else {
                System.out.print(i + " ");
            }
        }

    }
}
