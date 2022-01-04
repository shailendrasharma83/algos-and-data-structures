package starter_plan;

public class RotationCypher {


    // Add any helper functions you may need here

    static char[] charArray;
    static char[] intArray;

    static {
        charArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        intArray = "0123456789".toCharArray();
    }


    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom.
    int test_case_number = 1;

    void check(String expected, String output) {
        boolean result = (expected.equals(output));
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printString(expected);
            System.out.print(" Your output: ");
            printString(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printString(String str) {
        System.out.print("[\"" + str + "\"]");
    }

    public void run() {
        String input_1 = "All-convoYs-9-be:Alert1.";
        int rotationFactor_1 = 4;
        String expected_1 = "Epp-gsrzsCw-3-fi:Epivx5.";
        String output_1 = rotationalCipher(input_1, rotationFactor_1);
        check(expected_1, output_1);

        String input_2 = "abcdZXYzxy-999.@";
        int rotationFactor_2 = 200;
        String expected_2 = "stuvRPQrpq-999.@";
        String output_2 = rotationalCipher(input_2, rotationFactor_2);
        check(expected_2, output_2);

        // Add your own test cases here

    }

    private String rotationalCipher(String inputStr, int rotationFactor) {

        char[] input = inputStr.toCharArray();
        int calculatedRotationFactor = 0 ;

        for (int i = 0; i < input.length; i++) {
            calculatedRotationFactor = calculateRotationFactor(input[i], rotationFactor);
            input[i] = Character.isLetterOrDigit(input[i]) ? getCipher(input[i], calculatedRotationFactor) : input[i];
        }
        return String.valueOf(input);

    }

    private int calculateRotationFactor(char c, int rotationFactor) {
        if (Character.isLetter(c)) {
            rotationFactor += (new String(charArray).indexOf(Character.toLowerCase(c)));

            return rotationFactor <= 26 ? rotationFactor : wrap(rotationFactor, charArray.length);
        }

        rotationFactor += (new String(intArray).indexOf(c));
        return rotationFactor <= 10 ? rotationFactor : wrap(rotationFactor, intArray.length);
    }

    private char getCipher(char c, int rotationFactor) {

        return Character.isLetter(c) ? getaCharBasedOnCasing(c, rotationFactor) : intArray[rotationFactor];

    }

    private char getaCharBasedOnCasing(char c, int rotationFactor) {
        return Character.isUpperCase(c) ?  Character.toUpperCase(charArray[rotationFactor]) : charArray[rotationFactor];
    }

    private int wrap(int rotationFactor, int limit) {
        while (rotationFactor >= limit) {
            rotationFactor -= limit;
        }
        return rotationFactor;
    }

    public static void main(String[] args) {
        new RotationCypher().run();
    }
}