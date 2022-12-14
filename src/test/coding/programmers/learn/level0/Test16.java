package test.coding.programmers.learn.level0;

import java.util.stream.IntStream;

public class Test16 {

    public static void main(String[] args) {
        //짝수 홀수 개수
        int[] num_list = new int[]{1, 2, 3, 4, 5};




        int count = (int) IntStream.range(0, num_list.length).filter(i -> num_list[i] % 2 == 0).count();
        int[] answer = new int[]{count, (num_list.length - count)};
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
