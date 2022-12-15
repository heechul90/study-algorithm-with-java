package test.coding.programmers.learn.level0;

import java.util.stream.IntStream;

public class Test24 {

    /**
     * 연속된 수의 합
     */

    public static void main(String[] args) {
        int num = 5; //5
        int total = 5; //15

        int[] answer = getAnswer(num, total);
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }

    private static int[] getAnswer(int num, int total) {

        int sum = IntStream.range(1, num + 1).sum();
        int startNum = ((total - (sum)) / num) + 1;

        return IntStream.range(startNum, (startNum + num))
                .boxed()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
