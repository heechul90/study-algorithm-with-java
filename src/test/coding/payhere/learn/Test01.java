package test.coding.payhere.learn;

import java.util.stream.IntStream;

public class Test01 {

    public static void main(String[] args) {

        int[] numbers = new int[]{2, 7, 11, 15};
        int target = 9;


        int[] result = getResult(numbers, target);

        System.out.println("result = " + result[0] + " " + result[1]);
    }

    private static int[] getResult(int[] numbers, int target) {
        int[] result = new int[2];
        IntStream.range(0, numbers.length - 1).forEach(i -> {
            IntStream.range(i + 1, numbers.length).forEach(j -> {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            });
        });
        return result;
    }
}
