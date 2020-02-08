package LeetCode.Easy.Bit.NumberOf1Bits;

/**
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