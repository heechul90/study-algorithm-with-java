package test.coding.payhere.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test02 {

    public static void main(String[] args) {

        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};

        int[][] answer = getAnswer(intervals);



    }

    private static int[][] getAnswer(int[][] intervals) {
        List<int[][]> answer = new ArrayList<>();
        for (int i = 0; i < intervals.length - 1; i++) {

            List<Integer> firstList = IntStream.range(intervals[i][0], intervals[i][1] + 1).boxed().collect(Collectors.toList());
            List<Integer> secondList = IntStream.range(intervals[i + 1][0], intervals[i + 1][1] + 1).boxed().collect(Collectors.toList());

            boolean hasNum = false;
            for (Integer integer : firstList) {
                if (secondList.contains(integer)) {
                    answer.add(new int[][]{{firstList.get(0), secondList.get(secondList.size() - 1)}});
                    hasNum = true;
                    break;
                }
            }

            if (!hasNum) {
                answer.add(new int[][]{{secondList.get(0), secondList.get(secondList.size() - 1)}});
            }

        }
        return (int[][]) answer.toArray();
    }
}


