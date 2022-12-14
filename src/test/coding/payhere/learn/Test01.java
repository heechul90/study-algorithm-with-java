package test.coding.payhere.learn;

import java.util.stream.IntStream;

public class Test01 {
    /**
     * 두 수의 합
     */

    public static void main(String[] args) {

        int[] answer = getAnswer(new int[]{2, 7, 11, 15}, 9);
        System.out.println("answer = " + answer[0] + " " + answer[1]);

    }

    private static int[] getAnswer(int[] numbers, int target) {

        // i -> 0, j -> 1, 2, 3
        // i -> 1, j -> 2, 3
        // i -> 2, j -> 3

        int[] answer = new int[2];
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                    break;
                }
            }
        }

        return answer;
    }
}
