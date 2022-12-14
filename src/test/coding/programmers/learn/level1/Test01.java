package test.coding.programmers.learn.level1;

public class Test01 {

    public static void main(String[] args) {
        //짝수와 홀수

        int num = 1;

        String answer = getEvenOrOdd(num);

        System.out.println("answer = " + answer);


    }

    private static String getEvenOrOdd(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
