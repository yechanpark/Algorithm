package LeetCode.Easy.Math.FactorialTrailingZeros;

/**
 * Given an integer n, return the number of trailing zeroes in n!.
 * <p>
 * Example 1:
 * <p>
 * Input: 3
 * Output: 0
 * Explanation: 3! = 6, no trailing zero.
 * Example 2:
 * <p>
 * Input: 5
 * Output: 1
 * Explanation: 5! = 120, one trailing zero.
 * Note: Your solution should be in logarithmic time complexity.
 */
public class FactorialTrailingZeros {
    public int solution(int n) {

        int result = 0; // 결과가 포함하는 0의 갯수
        int multiply = 2;
        for (int i = multiply + 1; i <= n; i++) {
            multiply *= i;
        }
        while(multiply < 10) {
            if (multiply % 10 == 0) result++;

            multiply /= 10;
        }
        return result;
    }
}

/**
 * 키워드 - 수학계산, 팩토리얼(Factorial)
 */