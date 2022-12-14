package test.coding.programmers.learn.level0;

import java.util.Arrays;

public class Test10 {

    public static void main(String[] args) {
        //배열 자르기

        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int num1 = 1;
        int num2 = 3;

        int[] answer = Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}
