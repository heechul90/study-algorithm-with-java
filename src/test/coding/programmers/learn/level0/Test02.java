package test.coding.programmers.learn.level0;

public class Test02 {

    public static void main(String[] args) {
        //배열 두 배 만들기

        int[] numbers = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * 2;
        }

        for (int number : numbers) {
            System.out.println("number = " + number);
        }
    }
}
