package test.coding.programmers.learn.level1;

import java.util.stream.IntStream;

public class Test05 {

    public static void main(String[] args) {
        //정수 제곱근 판별

        long n = 10;


        long answer = 0;
        answer = n == 1 ? 4 : getAnswer(n);

        System.out.println("answer = " + answer);
    }

    private static long getAnswer(long n) {
        long num = IntStream.range(1, (int) (n / 2) + 1).filter(i -> i * i == n).findFirst().orElse(-1);
        System.out.println("num = " + num);
        return num != -1 ? (num + 1) * (num + 1) : num;
    }
}
