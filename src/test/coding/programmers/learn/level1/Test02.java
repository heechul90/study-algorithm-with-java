package test.coding.programmers.learn.level1;

import java.util.Arrays;

public class Test02 {

    public static void main(String[] args) {
        //평균 구하기

        int[] arr = new int[]{5, 5};

        double average = getAverage(arr);

        System.out.println("average = " + average);

    }

    private static double getAverage(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
}
