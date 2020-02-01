package LeetCode.Easy.String.ReverseInteger;

/**
 *
 */
public class ReverseInteger_BestPractice {
    public int solution(int x) {
        int prevRev = 0, rev = 0;
        while (x != 0) {
            rev = rev * 10 + x % 10;
            if ((rev - x % 10) / 10 != prevRev) {
                return 0;
            }
            prevRev = rev;
            x = x / 10;
        }
        return rev;

    }
}