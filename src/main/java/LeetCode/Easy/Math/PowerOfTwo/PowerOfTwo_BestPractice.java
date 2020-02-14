package LeetCode.Easy.Math.PowerOfTwo;

/**
 * 공식키워드 - Bit Manipulation, Math
 */

public class PowerOfTwo_BestPractice {
    public boolean solution(int n) {
        return n > 0 && Integer.bitCount(n) == 1;
    }
}