package test.coding.programmers.learn.level0;

import java.util.stream.IntStream;

public class Test15 {

    public static void main(String[] args) {
        //자릿수 더하기

        int n = 930211;



        String s = Integer.toString(n);

        int answer = IntStream.range(0, s.length()).map(i -> Integer.parseInt(s.substring(i, i + 1))).sum();

        System.out.println("answer = " + answer);

    }
}
