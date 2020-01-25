package leetcode.easy.plusone;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Example 2:
 * <p>
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */

public class PlusOne {
    public int[] solution(int[] digits) {
        int digitsLength = digits.length;
        int carry = 0;

        // digits를 거꾸로 돌면서
        for (int i = digitsLength - 1; i >= 0; i--) {
            // 처음 순회를 돌거나 carry(올림값)가 1인 경우
            if (i == digitsLength - 1 || carry == 1) {
                // 1을 더함
                digits[i]++;

                // 더했는데 10이 됐으면
                if (digits[i] == 10) {
                    // 값을 0으로 변경한 후 올림값을 1 증가
                    digits[i] = 0;
                    carry = 1;
                }
                // 10이 안됐으면 carry를 0으로 세팅
                else {
                    carry = 0;
                }
            }

            // 처음 순회를 도는게 아니고,
            // carry(올림값)가 0인 경우 지금까지 변경된 ditigts를 리턴
            else {
                return digits;
            }

        }

        // 모든 자리를 다 계산한 이후, 가장 큰 숫자의 자리수에서도 올림이 발생했으면
        if (carry == 1) {
            // 새로운 배열을 생성. carry가 있으므로 길이가 1 많아야 함
            int[] result = new int[digitsLength + 1];

            // carry가 있으므로 첫 째 자리를 1로 고정
            result[0] = 1;

            // 지금까지 변경된 digits 배열을 뒤에 붙여서 리턴
            System.arraycopy(digits, 0, result, 1, digitsLength);
            return result;
        }

        return digits;
    }
}

/**
 * 키워드 - 자리올림, carry
 */