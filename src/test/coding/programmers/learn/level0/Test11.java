package test.coding.programmers.learn.level0;

public class Test11 {

    public static void main(String[] args) {
        //피자 나눠 먹기(1)

        int n = 1;

        int answer = (n % 7 == 0) ? n / 7 : (n / 7) + 1;
        System.out.println("answer = " + answer);

        int count = 1;
        if (n % 7 == 0) {
            count = n / 7;
        } else if (n / 7 > 1) {
            count = (n / 7) + 1;
        }



        System.out.println("count = " + count);
    }
}
