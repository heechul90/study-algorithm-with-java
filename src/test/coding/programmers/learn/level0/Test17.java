package test.coding.programmers.learn.level0;

public class Test17 {

    public static void main(String[] args) {
        //문자열 뒤집기

        String my_string = "jaron";

        String answer = "";
        for (int i = my_string.length(); i > 0; i--) {
            System.out.println("my_string = " + my_string.substring(i - 1, i));
            answer += my_string.substring(i - 1, i);
        }
        System.out.println("answer = " + answer);
    }
}
