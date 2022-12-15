package test.coding.programmers.learn.level0;

public class Test23 {
    /**
     * 다음에 올 숫자
     */

    public static void main(String[] args) {
        //int[] common = {1, 2, 3, 4};
        int[] common = {2, 4, 8};

        int answer = getAnswer(common);
        System.out.println("answer = " + answer);
    }

    private static int getAnswer(int[] common) {
        int first = common[0];
        int second = common[1];
        int third = common[2];
        /*if ((second - first) == third - second) {
            //등차수열
            return common[common.length - 1] + (second - first);
        }
        if ((second / first) == third / second) {
            //등비수열
            return common[common.length - 1] * (second / first);
        }*/
        return (second - first) == (third - second) ? common[common.length - 1] + (second - first) : common[common.length - 1] * (second / first);

    }
}
