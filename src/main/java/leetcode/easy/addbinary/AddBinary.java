package leetcode.easy.addbinary;

/**
 * Given two binary strings, return their sum (also a binary string).
 * <p>
 * The input strings are both non-empty and contains only characters 1 or 0.
 * <p>
 * Example 1:
 * <p>
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 * <p>
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */

public class AddBinary {
    public String solution(String a, String b) {
        int aLegnth = a.length();
        int bLength = b.length();
        int resultLength = Math.max(aLegnth, bLength);
        int aIndex = aLegnth - 1;
        int bIndex = bLength - 1;

        StringBuilder result = new StringBuilder();
        int digitResult = 0;
        int carry = 0;

        for (int i = resultLength - 1; i >= 0; i--) {
            // a, b에 계산할게 남은 경우
            if (0 <= aIndex) digitResult += a.charAt(aIndex--) - '0';
            if (0 <= bIndex) digitResult += b.charAt(bIndex--) - '0';

            // 캐리 더함
            digitResult += carry;

            // 자리수의 합이 2가 넘는 경우
            if (digitResult >= 2) {
                // 2로 나눈 나머지를 저장하고
                digitResult %= 2;
                // 캐리를 1로 유지
                carry = 1;
            }
            // 자리수의 합이 2가 넘지 않는 경우
            else {
                // 캐리를 0으로 세팅
                carry = 0;
            }

            result.insert(0, digitResult);
            digitResult = 0;

        }

        // 캐리가 있는 경우 맨 앞에 1을 붙임
        if (carry == 1) result.insert(0, '1');

        return result.toString();
    }
}

/**
 * 키워드 - 자리올림, carry, 2진수 계산, binary, 문자계산, 문자열계산
 */