package LeetCode.Easy.BitManipulation.NumberOf1Bits;

/**
 * 공식키워드 - Bit Manipulation
 *
 * Unsigned bit shift operator
 */
public class NumberOf1Bits_BestPractice {
    // you need to treat n as an unsigned value
    public int solution(int n) {
        int hammingWeight = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                hammingWeight++;
            }
            n >>>= 1;
        }
        return hammingWeight;
    }
}