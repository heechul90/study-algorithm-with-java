package test.coding.programmers.learn.level0;

import java.util.stream.IntStream;

public class Test24 {
    /**
     * 짝수는 싫어요
     */

    public static void main(String[] args) {
        int n = 15;
        int[] answer = getAnswer(n);
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }

    private static int[] getAnswer(int n) {

        return IntStream.range(1, (n + 1)).boxed()
                .filter(i -> i % 2 != 0)
                .sorted()
                .mapToInt(Integer::intValue).toArray();
    }
}
