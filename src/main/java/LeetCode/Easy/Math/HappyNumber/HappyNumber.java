package LeetCode.Easy.Math.HappyNumber;

import java.util.HashMap;
import java.util.Map;

/**
 * 키워드 - 수학계산, Map
 *
 * Write an algorithm to determine if a number is "happy".
 * <p>
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 * <p>
 * Example:
 * <p>
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */
public class HappyNumber {
    private Map<Integer, Integer> map = new HashMap<>();

    public boolean solution(int n) {
        // n이 맵에 있으면 똑같은 숫자가 나오는 것이므로 싸이클 -> false
        if (map.containsKey(n)) return false;
        // n이 맵에 없으면 등록
        else map.put(n, 1);

        // 계산된 결과
        int subResult = 0;

        // n의 각 자릿수를 제곱하여 더함
        while(n > 0) {
            subResult += (int)Math.pow(n % 10, 2);
            n /= 10;
        }

        // 결과가 1인 경우 -> true
        if (subResult == 1) return true;

        return solution(subResult);
    }
}