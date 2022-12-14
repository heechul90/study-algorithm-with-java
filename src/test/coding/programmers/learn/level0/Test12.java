package test.coding.programmers.learn.level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Test12 {

    public static void main(String[] args) {
        //배열 뒤집기

        int[] num_list = new int[]{1, 2, 3, 4, 5};

        /*int[] answer = new int[num_list.length];

        for (int i = num_list.length - 1, j = 0; i >= 0; i--, j++) {
            answer[j] = num_list[i];
        }

        System.out.println("answer = " + answer);*/


        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        Collections.reverse(list);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }
}
