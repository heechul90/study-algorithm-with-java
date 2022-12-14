package test.coding.programmers.learn.level0;

public class Test01 {

    public static void main(String[] args) {
        //분수의 덧셈

        int denum1 = 9;
        int num1 = 2;
        int denum2 = 1;
        int num2 = 3;

        int[] answer;

        denum1 *= num2;
        denum2 *= num1;

        answer = new int[]{denum1 + denum2, num1 * num2};

        int greatest_common_divisor = GCD(answer[0], answer[1]);
        answer[0] /= greatest_common_divisor;
        answer[1] /= greatest_common_divisor;

        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }

    public static int GCD(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        return GCD(num2, num1 % num2);
    }
}
