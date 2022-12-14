package test.coding;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] numbers = new int[] {1,2,3,4,5,6,7,8,9,10};
        double answer = Arrays.stream(numbers).average().getAsDouble();
        System.out.println("answer = " + answer);
    }


}
