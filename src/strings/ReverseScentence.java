package strings;

public class ReverseScentence {

    public static void main(String[] args) {
        String line = "Hello world";
        System.out.println(reverse(line));


    }

    private static String reverse(String str) {
        StringBuffer sb = new StringBuffer();
        String[] arr = str.split(" ");
        String temp ;
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = arr[i];
            if (temp.endsWith(".")) {
                temp = temp.substring(0, temp.length() - 1);
                sb.append(temp.substring(0, 1).toUpperCase()).append(temp.substring(1, temp.length())).append(" ");
            } else {
                if (i == 0) {
                    sb.append(temp.substring(0, 1).toLowerCase()).append(temp.substring(1, temp.length())).append(".");
                    return sb.toString();
                }
                sb.append(temp.substring(0, 1).toLowerCase()).append(temp.substring(1, temp.length())).append(" ");
            }
        }

        return "";
    }
}
