package recursion;

public class SuperDigit {
    public static void main(String[] args) {
        System.out.println(superDigit("148", 3));
    }

    public static int superDigit(String n, int k) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < k; i++) {
            sb.append(n);
        }
        n = sb.toString();

        int result = Integer.MAX_VALUE;

        while (result > 10) {
            result = sum(n, 0);
            System.out.println("Result :: " + result);
            n = String.valueOf(result);
        }

        return result;
    }

    public static int sum(String n, int index) {
        if (index >= n.length()) {
            return 0;
        }
        return Integer.parseInt(String.valueOf(n.charAt(index))) + sum(n, ++index);
    }

}
