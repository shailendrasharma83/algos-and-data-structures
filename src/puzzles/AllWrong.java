package puzzles;

/*
* There's a multiple-choice test with NN questions, numbered from 11 to NN. Each question has 22 answer options,
* labelled A and B. You know that the correct answer for the iith question is the iith character in the string CC,
* which is either "A" or "B", but you want to get a score of 00 on this test by answering every question incorrectl
* */

public class AllWrong {

    public static void main(String[] args) {
        System.out.println(new AllWrong().getWrongAnswers(3, "ABA"));
    }

    public String getWrongAnswers(int N, String C) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i<N;i++) {
            sb.append(C.charAt(i) == 'A' ? 'B' : 'A');
        }
        return sb.toString();
    }
}