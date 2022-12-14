package test.coding.programmers.learn.level0;

import java.util.stream.IntStream;

public class Test03 {

    public static void main(String[] args) {
        //짝수의 합

        int n = 15;

        int sum = IntStream.range(1, n + 1).filter(i -> i % 2 == 0).sum();


        System.out.println("sum = " + sum);
    }
}
