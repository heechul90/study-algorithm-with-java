package test.coding.programmers.learn.level0;

public class Test21 {
    /**
     * 아이스 아메리카노
     */

    public static void main(String[] args) {
        int money = 15000;
        int[] answer = getAnswer(money);
        for (int i : answer) {
            System.out.println("i = " + i);
        }
    }

    private static int[] getAnswer(int money) {
        return money < 5500 ? new int[]{0, money} : money % 5500 == 0 ? new int[]{(money / 5500), 0} : new int[]{(money / 5500), (money % 5500)};
    }

}
