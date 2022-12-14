package test.coding.programmers.learn.level0;

import java.util.Arrays;

public class Test04 {

    public static void main(String[] args) {
        //중복된 숫자 개수

        int[] array = new int[]{1, 1, 2, 3, 4, 5};
        int n = 1;

        long count = Arrays.stream(array).filter(value -> value == n).count();

        System.out.println("count = " + count);
    }
}
