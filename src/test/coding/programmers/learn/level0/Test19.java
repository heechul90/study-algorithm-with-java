package test.coding.programmers.learn.level0;

public class Test19 {
    /**
     * 피자 나눠 먹기(3)
     */

    public static void main(String[] args) {
        int answer = getAnswer(4, 12);
        System.out.println("answer = " + answer);
    }

    private static int getAnswer(int slice, int n) {
        return slice >= n ? 1 : (n % slice) == 0 ? (n / slice) : 1 + (n / slice);
    }
}
