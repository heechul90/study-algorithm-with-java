package test.coding.programmers.learn.level0;

public class Test08 {

    public static void main(String[] args) {
        //특정 문자 제거하기

        String my_string = "BCBdbe";
        String letter = "B";

        String answer = my_string.replaceAll(letter, "");
        System.out.println("answer = " + answer);
    }
}
