package test.coding.programmers.learn.level1;

import java.util.stream.IntStream;

public class Test04 {

    public static void main(String[] args) {
        //자릿수 더학

        int n = 987;

        int sum = getSum(n);
        System.out.println("sum = " + sum);
    }

    private static int getSum(int n) {
        String str = Integer.toString(n);
        return IntStream.range(0, str.length()).map(i -> Integer.parseInt(str.substring(i, i + 1))).sum();
    }
}
