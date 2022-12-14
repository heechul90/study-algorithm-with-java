package test.coding.programmers.learn.level0;

public class Test14 {

    public static void main(String[] args) {
        //점의 위치 구하기

        int[] dot = new int[]{-7, 9};

        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        } else if (dot[0] < 0 && dot[1] < 0) {
            answer = 3;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        System.out.println("answer = " + answer);
    }
}
