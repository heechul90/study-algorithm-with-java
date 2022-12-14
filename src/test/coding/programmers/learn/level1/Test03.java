package test.coding.programmers.learn.level1;

import java.util.stream.IntStream;

public class Test03 {

    public static void main(String[] args) {
        //약수의 합

        int n = 12;


        int sum = getSum(n);

        System.out.println("sum = " + sum);
    }

    private static int getSum(int n) {
        return IntStream.range(1, n + 1).filter(i -> n % i == 0).sum();
    }
}
