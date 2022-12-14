package test.coding.programmers.learn.level0;

public class Test09 {

    public static void main(String[] args) {
        //제곱수 판별하기

        int n = 144;

        int answer = 0;
        for (int i = 1; i < n / 2; i++) {
            if (i * i == n) {
                answer = 1;
                break;
            } else {
                answer = 2;
            }
        }

        System.out.println("answer = " + answer);
    }
}
