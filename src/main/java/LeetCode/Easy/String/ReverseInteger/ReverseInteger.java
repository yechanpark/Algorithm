package LeetCode.Easy.String.ReverseInteger;

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: 120
 * Output: 21
 * Note:
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−2^31,  2^31 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.
 */

public class ReverseInteger {
    public int solution(int x) {
        char[] charArr = ("" + x).toCharArray();
        int charArrLength = charArr.length;

        // 결과를 담을 String
        StringBuilder resultStr = new StringBuilder("");

        // 음수일 때 시작할 위치
        int startIndexWhenMinis = 0;

        // 숫자가 시작했는지 여부
        boolean isStartedNunber = false;

        // 첫 번재 문자가 음수인 경우 음수처리
        if ( charArr[0] == '-' ) {
            startIndexWhenMinis = 1;
            resultStr = new StringBuilder("-");
        }

        // 1회 순회로 해결
        for (int i = startIndexWhenMinis; i < charArrLength; i++) {
            if (i > 32) return 0;

            // 현재 숫자가 0이 아니면서 숫자가 시작되지 않은 경우
            if (charArr[i] != 0 && !isStartedNunber) {
                // 숫자가 시작됐다고 알림
                isStartedNunber = true;
            }

            // 숫자가 시작된 경우
            if ( isStartedNunber ) {
                // 음수인 경우 1 자리 부터 넣음, 양수인 경우 0자리 부터 넣음
                resultStr.insert(startIndexWhenMinis, charArr[i]);
            }

        }

        try {

            return Integer.parseInt(resultStr.toString());
        }
        catch (NumberFormatException e) {
            // -2^31 ~ 2^31 -1 범위에 들지 않으면 0을 리턴
            return 0;
        }

    }
}

/**
 * 키워드 - 수학계산, Integer범위, Long범위
 */