package LeetCode.Easy.Math.PalindromeNumber;

/**
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * Example 1:
 * <p>
 * Input: 121
 * Output: true
 * Example 2:
 * <p>
 * Input: -121
 * Output: false
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
 * Example 3:
 * <p>
 * Input: 10
 * Output: false
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 * Follow up:
 * <p>
 * Coud you solve it without converting the integer to a string?
 */

public class PalindromeNumber {
    public boolean solution(int x) {
        // 음수는 무조건 false
        if (x < 0) return false;

        // x의 역순 결과를 저장하기 위한 숫자
        int reverseNumber = 0;

        // x와 복사, x의 역순을 구하기 위해 사용되는 변수
        int calculateNumber = x;

        while(true) {
            // calculateNumber의 1의 자리를 구해서 reverseNumber에 더함
            reverseNumber += calculateNumber % 10;

            // 다음 자릿수를 얻기 위해 10을 나눔
            calculateNumber /= 10;

            if (reverseNumber == 0 && x != 0) return false;

            if (reverseNumber == calculateNumber)
                return true;

            // 아직 계산할게 남은 경우
            if (calculateNumber != 0) {
                // 다음 계산을 위해 역순 숫자에 10을 곱함
                reverseNumber *= 10;
            }
            else break;


        }

        return x == reverseNumber;

    }
}

/**
 * 키워드 - 수학계산, 자릿수 구하기, 뒤집기, 절반까지만 계산(홀수, 짝수 고려)
 */