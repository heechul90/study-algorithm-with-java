package test.coding.programmers.learn.level0;

import java.util.stream.IntStream;

public class Test22 {
    /**
     * 문자 반복 출력하기
     */

    public static void main(String[] args) {
        String my_string = "hello";
        int n = 3;

        String answer = getAnswer(my_string, n);
        System.out.println("answer = " + answer);
    }

    private static String getAnswer(String my_string, int n) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            for (int j = 0; j < n; j++) {
                answer += my_string.substring(i, i + 1);
            }
        }
        return answer;
    }
}
