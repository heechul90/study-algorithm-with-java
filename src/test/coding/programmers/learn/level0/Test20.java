package test.coding.programmers.learn.level0;

import java.util.Arrays;

public class Test20 {
    /**
     * 배열 원소의 길이
     */

    public static void main(String[] args) {
        String[] strlist = new String[]{"We", "are", "the", "world!"};
        int[] answer = getAnswer(strlist);

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }

    private static int[] getAnswer(String[] strlist) {
        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }
}
