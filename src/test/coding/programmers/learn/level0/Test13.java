package test.coding.programmers.learn.level0;

import java.util.Arrays;

public class Test13 {

    public static void main(String[] args) {
        //최대값 만들기 (1)
        int[] numbers = new int[]{0, 31, 24, 10, 1, 9};

        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] * numbers[j] > answer) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }

        System.out.println("answer = " + answer);

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }
}
