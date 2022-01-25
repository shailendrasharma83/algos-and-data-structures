//Implement a function that outputs the Look and Say sequence:
//        1
//        11
//        21
//        1211
//        111221
//        312211
//        13112221
//        1113213211



package arrays;

public class LookAndSaySequence {

    public static void main(String[] args) {
        System.out.println(lookandSay(111221, 0));
    }

    private static String lookandSay(int num, int index) {
        String look = Integer.toString(num);

        if (index >= look.length()) {
            return "";
        }

        int numberToCount = Character.getNumericValue(look.charAt(index));
        int count = 0;

        for (int i = index; i < look.length(); i++) {
            if (Character.getNumericValue(look.charAt(i)) != numberToCount) {
                break;
            }
            index++;
            count++;
        }

        return  count + "" + numberToCount + lookandSay(num, index);
    }
}