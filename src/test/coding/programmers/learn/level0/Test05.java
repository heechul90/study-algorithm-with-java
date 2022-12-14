package test.coding.programmers.learn.level0;

import java.util.Arrays;

public class Test05 {

    public static void main(String[] args) {
        //머쓱이보다 키 큰 사람

        int[] array = new int[]{149, 180, 192, 170};
        int height = 167;

        int count = (int) Arrays.stream(array).filter(value -> value > height).count();

        System.out.println("count = " + count);
    }
}
