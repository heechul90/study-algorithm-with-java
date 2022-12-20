package test.coding.payhere.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Test03 {

    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] answer = getAnswer(intervals);

        for (int[] ints : answer) {
            System.out.println(ints[0] + " " + ints[1]);
        }
    }

    private static int[][] getAnswer(int[][] intervals) {
        List<int[]> answer = new ArrayList<>();


        IntStream.range(0, intervals.length - 1).forEach(i -> {
            //intervals[i][1] >= intervals[i + 1][0] ? answer.add(new int[]{intervals[i][0], intervals[i + 1][1]}) :
            if (intervals[i][1] >= intervals[i + 1][0]) {
                answer.add(new int[]{intervals[i][0], intervals[i + 1][1]});
            } else {
                answer.add(new int[]{intervals[i + 1][0], intervals[i + 1][1]});
            }
        });
        return answer.toArray(new int[1][]);
    }
}
