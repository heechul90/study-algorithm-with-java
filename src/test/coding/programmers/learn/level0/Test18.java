package test.coding.programmers.learn.level0;

public class Test18 {
    /**
     * 옹알이(1)
     */

    public static void main(String[] args) {

        int answer = solution(new String[]{"aya", "yee", "u", "maa", "wyeoo"});
        System.out.println("answer = " + answer);

    }

    private static int solution(String[] babbling) {

        String[] pronounces = new String[]{"aya", "ye", "woo", "ma"};

        int answer = 0;
        for (String babble : babbling) {
            if (babble.contains(pronounces[0] + pronounces[0]) ||
                    babble.contains(pronounces[1] + pronounces[1]) ||
                    babble.contains(pronounces[2] + pronounces[2]) ||
                    babble.contains(pronounces[3] + pronounces[3])) {
                continue;
            }

            String result = babble
                    .replaceAll("aya", "")
                    .replaceAll("ye", "")
                    .replaceAll("woo", "")
                    .replaceAll("ma", "");

            if (result.length() == 0) {
                answer++;
            }
        }

        return answer;
    }
}
