package LeetCode.Easy.Math.AddDigits;

/**
 * 키워드 - Math
 * <p>
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * <p>
 * Example:
 * <p>
 * Input: 38
 * Output: 2
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class AddDigits {
    public int solution(int num) {
        while (num >= 10) {
            int sum = 0;
            int subNum = num;
            while (subNum != 0) {
                sum += subNum % 10;
                subNum /= 10;
            }
            num = sum;
        }
        return num;
    }
}