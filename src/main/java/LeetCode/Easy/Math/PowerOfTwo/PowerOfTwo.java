package LeetCode.Easy.Math.PowerOfTwo;

/**
 * 키워드 - Bit, Math
 * <p>
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 * Explanation: 2^0 = 1
 * Example 2:
 * <p>
 * Input: 16
 * Output: true
 * Explanation: 2^4 = 16
 * Example 3:
 * <p>
 * Input: 218
 * Output: false
 */

public class PowerOfTwo {
    public boolean solution(int n) {
        if (n <= 0) return false;

        String nString = Integer.toBinaryString(n);
        int countBit = 0;
        for (int i = 0; i < nString.length(); i++) {
            if (nString.charAt(i) == '1') {
                countBit++;
                if (countBit >= 2) return false;
            }
        }
        return true;
    }
}